// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class DataSetLogicalTableMap {
    @CustomType.Constructor
    private DataSetLogicalTableMap() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSetLogicalTableMap defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(DataSetLogicalTableMap defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public DataSetLogicalTableMap build() {
            return new DataSetLogicalTableMap();
        }
    }
}
