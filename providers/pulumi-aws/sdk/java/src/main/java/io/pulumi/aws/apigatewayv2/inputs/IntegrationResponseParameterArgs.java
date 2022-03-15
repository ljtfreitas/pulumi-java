// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class IntegrationResponseParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationResponseParameterArgs Empty = new IntegrationResponseParameterArgs();

    /**
     * A key-value map. The key of ths map identifies the location of the request parameter to change, and how to change it. The corresponding value specifies the new data for the parameter.
     * See the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html) for details.
     * 
     */
    @Import(name="mappings", required=true)
      private final Output<Map<String,String>> mappings;

    public Output<Map<String,String>> getMappings() {
        return this.mappings;
    }

    /**
     * The HTTP status code in the range 200-599.
     * 
     */
    @Import(name="statusCode", required=true)
      private final Output<String> statusCode;

    public Output<String> getStatusCode() {
        return this.statusCode;
    }

    public IntegrationResponseParameterArgs(
        Output<Map<String,String>> mappings,
        Output<String> statusCode) {
        this.mappings = Objects.requireNonNull(mappings, "expected parameter 'mappings' to be non-null");
        this.statusCode = Objects.requireNonNull(statusCode, "expected parameter 'statusCode' to be non-null");
    }

    private IntegrationResponseParameterArgs() {
        this.mappings = Output.empty();
        this.statusCode = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationResponseParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Map<String,String>> mappings;
        private Output<String> statusCode;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationResponseParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mappings = defaults.mappings;
    	      this.statusCode = defaults.statusCode;
        }

        public Builder mappings(Output<Map<String,String>> mappings) {
            this.mappings = Objects.requireNonNull(mappings);
            return this;
        }

        public Builder mappings(Map<String,String> mappings) {
            this.mappings = Output.of(Objects.requireNonNull(mappings));
            return this;
        }

        public Builder statusCode(Output<String> statusCode) {
            this.statusCode = Objects.requireNonNull(statusCode);
            return this;
        }

        public Builder statusCode(String statusCode) {
            this.statusCode = Output.of(Objects.requireNonNull(statusCode));
            return this;
        }
        public IntegrationResponseParameterArgs build() {
            return new IntegrationResponseParameterArgs(mappings, statusCode);
        }
    }
}
