// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FunctionOutputResponse {
    /**
     * The (Azure Stream Analytics supported) data type of the function output. A list of valid Azure Stream Analytics data types are described at https://msdn.microsoft.com/en-us/library/azure/dn835065.aspx
     * 
     */
    private final @Nullable String dataType;

    @CustomType.Constructor
    private FunctionOutputResponse(@CustomType.Parameter("dataType") @Nullable String dataType) {
        this.dataType = dataType;
    }

    /**
     * The (Azure Stream Analytics supported) data type of the function output. A list of valid Azure Stream Analytics data types are described at https://msdn.microsoft.com/en-us/library/azure/dn835065.aspx
     * 
    */
    public Optional<String> getDataType() {
        return Optional.ofNullable(this.dataType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dataType;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataType = defaults.dataType;
        }

        public Builder dataType(@Nullable String dataType) {
            this.dataType = dataType;
            return this;
        }
        public FunctionOutputResponse build() {
            return new FunctionOutputResponse(dataType);
        }
    }
}
