// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakeanalytics.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The parameters used to add a new Data Lake Store account while creating a new Data Lake Analytics account.
 * 
 */
public final class AddDataLakeStoreWithAccountParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final AddDataLakeStoreWithAccountParametersArgs Empty = new AddDataLakeStoreWithAccountParametersArgs();

    /**
     * The unique name of the Data Lake Store account to add.
     * 
     */
    @InputImport(name="name", required=true)
        private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The optional suffix for the Data Lake Store account.
     * 
     */
    @InputImport(name="suffix")
        private final @Nullable Input<String> suffix;

    public Input<String> getSuffix() {
        return this.suffix == null ? Input.empty() : this.suffix;
    }

    public AddDataLakeStoreWithAccountParametersArgs(
        Input<String> name,
        @Nullable Input<String> suffix) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.suffix = suffix;
    }

    private AddDataLakeStoreWithAccountParametersArgs() {
        this.name = Input.empty();
        this.suffix = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AddDataLakeStoreWithAccountParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private @Nullable Input<String> suffix;

        public Builder() {
    	      // Empty
        }

        public Builder(AddDataLakeStoreWithAccountParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.suffix = defaults.suffix;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setSuffix(@Nullable Input<String> suffix) {
            this.suffix = suffix;
            return this;
        }

        public Builder setSuffix(@Nullable String suffix) {
            this.suffix = Input.ofNullable(suffix);
            return this;
        }
        public AddDataLakeStoreWithAccountParametersArgs build() {
            return new AddDataLakeStoreWithAccountParametersArgs(name, suffix);
        }
    }
}
