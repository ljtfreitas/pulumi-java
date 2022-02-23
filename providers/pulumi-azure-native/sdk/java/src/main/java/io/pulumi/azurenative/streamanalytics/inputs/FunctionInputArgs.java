// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes one input parameter of a function.
 * 
 */
public final class FunctionInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final FunctionInputArgs Empty = new FunctionInputArgs();

    /**
     * The (Azure Stream Analytics supported) data type of the function input parameter. A list of valid Azure Stream Analytics data types are described at https://msdn.microsoft.com/en-us/library/azure/dn835065.aspx
     * 
     */
    @InputImport(name="dataType")
        private final @Nullable Input<String> dataType;

    public Input<String> getDataType() {
        return this.dataType == null ? Input.empty() : this.dataType;
    }

    /**
     * A flag indicating if the parameter is a configuration parameter. True if this input parameter is expected to be a constant. Default is false.
     * 
     */
    @InputImport(name="isConfigurationParameter")
        private final @Nullable Input<Boolean> isConfigurationParameter;

    public Input<Boolean> getIsConfigurationParameter() {
        return this.isConfigurationParameter == null ? Input.empty() : this.isConfigurationParameter;
    }

    public FunctionInputArgs(
        @Nullable Input<String> dataType,
        @Nullable Input<Boolean> isConfigurationParameter) {
        this.dataType = dataType;
        this.isConfigurationParameter = isConfigurationParameter;
    }

    private FunctionInputArgs() {
        this.dataType = Input.empty();
        this.isConfigurationParameter = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> dataType;
        private @Nullable Input<Boolean> isConfigurationParameter;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataType = defaults.dataType;
    	      this.isConfigurationParameter = defaults.isConfigurationParameter;
        }

        public Builder setDataType(@Nullable Input<String> dataType) {
            this.dataType = dataType;
            return this;
        }

        public Builder setDataType(@Nullable String dataType) {
            this.dataType = Input.ofNullable(dataType);
            return this;
        }

        public Builder setIsConfigurationParameter(@Nullable Input<Boolean> isConfigurationParameter) {
            this.isConfigurationParameter = isConfigurationParameter;
            return this;
        }

        public Builder setIsConfigurationParameter(@Nullable Boolean isConfigurationParameter) {
            this.isConfigurationParameter = Input.ofNullable(isConfigurationParameter);
            return this;
        }
        public FunctionInputArgs build() {
            return new FunctionInputArgs(dataType, isConfigurationParameter);
        }
    }
}
