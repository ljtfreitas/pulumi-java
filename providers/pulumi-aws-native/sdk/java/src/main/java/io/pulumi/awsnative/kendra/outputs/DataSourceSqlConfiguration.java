// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.outputs;

import io.pulumi.awsnative.kendra.enums.DataSourceQueryIdentifiersEnclosingOption;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataSourceSqlConfiguration {
    private final @Nullable DataSourceQueryIdentifiersEnclosingOption queryIdentifiersEnclosingOption;

    @CustomType.Constructor
    private DataSourceSqlConfiguration(@CustomType.Parameter("queryIdentifiersEnclosingOption") @Nullable DataSourceQueryIdentifiersEnclosingOption queryIdentifiersEnclosingOption) {
        this.queryIdentifiersEnclosingOption = queryIdentifiersEnclosingOption;
    }

    public Optional<DataSourceQueryIdentifiersEnclosingOption> getQueryIdentifiersEnclosingOption() {
        return Optional.ofNullable(this.queryIdentifiersEnclosingOption);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceSqlConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DataSourceQueryIdentifiersEnclosingOption queryIdentifiersEnclosingOption;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceSqlConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryIdentifiersEnclosingOption = defaults.queryIdentifiersEnclosingOption;
        }

        public Builder queryIdentifiersEnclosingOption(@Nullable DataSourceQueryIdentifiersEnclosingOption queryIdentifiersEnclosingOption) {
            this.queryIdentifiersEnclosingOption = queryIdentifiersEnclosingOption;
            return this;
        }
        public DataSourceSqlConfiguration build() {
            return new DataSourceSqlConfiguration(queryIdentifiersEnclosingOption);
        }
    }
}
