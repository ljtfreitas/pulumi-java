// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1AttributeResponse;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1GraphQLOperationResponse;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1QuotaResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudApigeeV1GraphQLOperationConfigResponse {
    /**
     * Name of the API proxy endpoint or remote service with which the GraphQL operation and quota are associated.
     * 
     */
    private final String apiSource;
    /**
     * Custom attributes associated with the operation.
     * 
     */
    private final List<GoogleCloudApigeeV1AttributeResponse> attributes;
    /**
     * List of GraphQL name/operation type pairs for the proxy or remote service to which quota will be applied. If only operation types are specified, the quota will be applied to all GraphQL requests irrespective of the GraphQL name. **Note**: Currently, you can specify only a single GraphQLOperation. Specifying more than one will cause the operation to fail.
     * 
     */
    private final List<GoogleCloudApigeeV1GraphQLOperationResponse> operations;
    /**
     * Quota parameters to be enforced for the resources, methods, and API source combination. If none are specified, quota enforcement will not be done.
     * 
     */
    private final GoogleCloudApigeeV1QuotaResponse quota;

    @OutputCustomType.Constructor({"apiSource","attributes","operations","quota"})
    private GoogleCloudApigeeV1GraphQLOperationConfigResponse(
        String apiSource,
        List<GoogleCloudApigeeV1AttributeResponse> attributes,
        List<GoogleCloudApigeeV1GraphQLOperationResponse> operations,
        GoogleCloudApigeeV1QuotaResponse quota) {
        this.apiSource = Objects.requireNonNull(apiSource);
        this.attributes = Objects.requireNonNull(attributes);
        this.operations = Objects.requireNonNull(operations);
        this.quota = Objects.requireNonNull(quota);
    }

    /**
     * Name of the API proxy endpoint or remote service with which the GraphQL operation and quota are associated.
     * 
     */
    public String getApiSource() {
        return this.apiSource;
    }
    /**
     * Custom attributes associated with the operation.
     * 
     */
    public List<GoogleCloudApigeeV1AttributeResponse> getAttributes() {
        return this.attributes;
    }
    /**
     * List of GraphQL name/operation type pairs for the proxy or remote service to which quota will be applied. If only operation types are specified, the quota will be applied to all GraphQL requests irrespective of the GraphQL name. **Note**: Currently, you can specify only a single GraphQLOperation. Specifying more than one will cause the operation to fail.
     * 
     */
    public List<GoogleCloudApigeeV1GraphQLOperationResponse> getOperations() {
        return this.operations;
    }
    /**
     * Quota parameters to be enforced for the resources, methods, and API source combination. If none are specified, quota enforcement will not be done.
     * 
     */
    public GoogleCloudApigeeV1QuotaResponse getQuota() {
        return this.quota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1GraphQLOperationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiSource;
        private List<GoogleCloudApigeeV1AttributeResponse> attributes;
        private List<GoogleCloudApigeeV1GraphQLOperationResponse> operations;
        private GoogleCloudApigeeV1QuotaResponse quota;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1GraphQLOperationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiSource = defaults.apiSource;
    	      this.attributes = defaults.attributes;
    	      this.operations = defaults.operations;
    	      this.quota = defaults.quota;
        }

        public Builder setApiSource(String apiSource) {
            this.apiSource = Objects.requireNonNull(apiSource);
            return this;
        }

        public Builder setAttributes(List<GoogleCloudApigeeV1AttributeResponse> attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }

        public Builder setOperations(List<GoogleCloudApigeeV1GraphQLOperationResponse> operations) {
            this.operations = Objects.requireNonNull(operations);
            return this;
        }

        public Builder setQuota(GoogleCloudApigeeV1QuotaResponse quota) {
            this.quota = Objects.requireNonNull(quota);
            return this;
        }
        public GoogleCloudApigeeV1GraphQLOperationConfigResponse build() {
            return new GoogleCloudApigeeV1GraphQLOperationConfigResponse(apiSource, attributes, operations, quota);
        }
    }
}
