// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RCranPackageArgs extends io.pulumi.resources.ResourceArgs {

    public static final RCranPackageArgs Empty = new RCranPackageArgs();

    /**
     * The package name.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The repository name.
     * 
     */
    @InputImport(name="repository")
        private final @Nullable Input<String> repository;

    public Input<String> getRepository() {
        return this.repository == null ? Input.empty() : this.repository;
    }

    public RCranPackageArgs(
        @Nullable Input<String> name,
        @Nullable Input<String> repository) {
        this.name = name;
        this.repository = repository;
    }

    private RCranPackageArgs() {
        this.name = Input.empty();
        this.repository = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RCranPackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> repository;

        public Builder() {
    	      // Empty
        }

        public Builder(RCranPackageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.repository = defaults.repository;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRepository(@Nullable Input<String> repository) {
            this.repository = repository;
            return this;
        }

        public Builder setRepository(@Nullable String repository) {
            this.repository = Input.ofNullable(repository);
            return this;
        }
        public RCranPackageArgs build() {
            return new RCranPackageArgs(name, repository);
        }
    }
}
