curl "https://api.sandbox.layer1.com/digital/api-docs" | jq | sed 's/"openId": \[/"oauth2": \[/g' > digital.json

INPUT_FILE="digital.json"
BASE_PACKAGE="com.layer1.clients.java8.digital"
GROUP_ID="com.layer1.clients"
ARTIFACT_ID="java8-digital"

openapi-generator generate -i digital.json -g java -o . \
  --additional-properties dateLibrary=java8 \
  --additional-properties hideGenerationTimestamp=true \
  --additional-properties library=okhttp-gson \
  --additional-properties groupId=${GROUP_ID} \
  --additional-properties artifactId=${ARTIFACT_ID} \
  --additional-properties invokerPackage=${BASE_PACKAGE}.invoker \
  --additional-properties apiPackage=${BASE_PACKAGE}.api \
  --additional-properties modelPackage=${BASE_PACKAGE}.model \
  --additional-properties enumUnknownDefaultCase=true \
  --additional-properties generateBuilders=true \
  --additional-properties useSingleRequestParameter=true \
  --additional-properties disallowAdditionalPropertiesIfNotPresent=false 

echo "digital.json" >> .gitignore

