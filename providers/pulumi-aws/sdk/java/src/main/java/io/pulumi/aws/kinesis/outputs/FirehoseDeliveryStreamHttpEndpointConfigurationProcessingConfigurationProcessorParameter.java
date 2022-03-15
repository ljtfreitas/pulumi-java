// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameter {
    /**
     * Parameter name. Valid Values: `LambdaArn`, `NumberOfRetries`, `RoleArn`, `BufferSizeInMBs`, `BufferIntervalInSeconds`
     * 
     */
    private final String parameterName;
    /**
     * Parameter value. Must be between 1 and 512 length (inclusive). When providing a Lambda ARN, you should specify the resource version as well.
     * 
     */
    private final String parameterValue;

    @CustomType.Constructor
    private FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameter(
        @CustomType.Parameter("parameterName") String parameterName,
        @CustomType.Parameter("parameterValue") String parameterValue) {
        this.parameterName = parameterName;
        this.parameterValue = parameterValue;
    }

    /**
     * Parameter name. Valid Values: `LambdaArn`, `NumberOfRetries`, `RoleArn`, `BufferSizeInMBs`, `BufferIntervalInSeconds`
     * 
    */
    public String getParameterName() {
        return this.parameterName;
    }
    /**
     * Parameter value. Must be between 1 and 512 length (inclusive). When providing a Lambda ARN, you should specify the resource version as well.
     * 
    */
    public String getParameterValue() {
        return this.parameterValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String parameterName;
        private String parameterValue;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameterName = defaults.parameterName;
    	      this.parameterValue = defaults.parameterValue;
        }

        public Builder parameterName(String parameterName) {
            this.parameterName = Objects.requireNonNull(parameterName);
            return this;
        }

        public Builder parameterValue(String parameterValue) {
            this.parameterValue = Objects.requireNonNull(parameterValue);
            return this;
        }
        public FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameter build() {
            return new FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameter(parameterName, parameterValue);
        }
    }
}
