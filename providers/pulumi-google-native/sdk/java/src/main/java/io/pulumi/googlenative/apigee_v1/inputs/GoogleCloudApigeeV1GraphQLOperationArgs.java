// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents the pairing of GraphQL operation types and the GraphQL operation name.
 * 
 */
public final class GoogleCloudApigeeV1GraphQLOperationArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudApigeeV1GraphQLOperationArgs Empty = new GoogleCloudApigeeV1GraphQLOperationArgs();

    /**
     * GraphQL operation name. The name and operation type will be used to apply quotas. If no name is specified, the quota will be applied to all GraphQL operations irrespective of their operation names in the payload.
     * 
     */
    @Import(name="operation")
      private final @Nullable Output<String> operation;

    public Output<String> getOperation() {
        return this.operation == null ? Output.empty() : this.operation;
    }

    /**
     * GraphQL operation types. Valid values include `query` or `mutation`. **Note**: Apigee does not currently support `subscription` types.
     * 
     */
    @Import(name="operationTypes", required=true)
      private final Output<List<String>> operationTypes;

    public Output<List<String>> getOperationTypes() {
        return this.operationTypes;
    }

    public GoogleCloudApigeeV1GraphQLOperationArgs(
        @Nullable Output<String> operation,
        Output<List<String>> operationTypes) {
        this.operation = operation;
        this.operationTypes = Objects.requireNonNull(operationTypes, "expected parameter 'operationTypes' to be non-null");
    }

    private GoogleCloudApigeeV1GraphQLOperationArgs() {
        this.operation = Output.empty();
        this.operationTypes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1GraphQLOperationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> operation;
        private Output<List<String>> operationTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1GraphQLOperationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operation = defaults.operation;
    	      this.operationTypes = defaults.operationTypes;
        }

        public Builder operation(@Nullable Output<String> operation) {
            this.operation = operation;
            return this;
        }

        public Builder operation(@Nullable String operation) {
            this.operation = Output.ofNullable(operation);
            return this;
        }

        public Builder operationTypes(Output<List<String>> operationTypes) {
            this.operationTypes = Objects.requireNonNull(operationTypes);
            return this;
        }

        public Builder operationTypes(List<String> operationTypes) {
            this.operationTypes = Output.of(Objects.requireNonNull(operationTypes));
            return this;
        }
        public GoogleCloudApigeeV1GraphQLOperationArgs build() {
            return new GoogleCloudApigeeV1GraphQLOperationArgs(operation, operationTypes);
        }
    }
}
