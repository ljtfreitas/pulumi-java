// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.refactorspaces;

import io.pulumi.awsnative.refactorspaces.enums.EnvironmentNetworkFabricType;
import io.pulumi.awsnative.refactorspaces.inputs.EnvironmentTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentArgs Empty = new EnvironmentArgs();

    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="networkFabricType")
      private final @Nullable Output<EnvironmentNetworkFabricType> networkFabricType;

    public Output<EnvironmentNetworkFabricType> getNetworkFabricType() {
        return this.networkFabricType == null ? Output.empty() : this.networkFabricType;
    }

    /**
     * Metadata that you can assign to help organize the frameworks that you create. Each tag is a key-value pair.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<EnvironmentTagArgs>> tags;

    public Output<List<EnvironmentTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public EnvironmentArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<EnvironmentNetworkFabricType> networkFabricType,
        @Nullable Output<List<EnvironmentTagArgs>> tags) {
        this.description = description;
        this.name = name;
        this.networkFabricType = networkFabricType;
        this.tags = tags;
    }

    private EnvironmentArgs() {
        this.description = Output.empty();
        this.name = Output.empty();
        this.networkFabricType = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<EnvironmentNetworkFabricType> networkFabricType;
        private @Nullable Output<List<EnvironmentTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.networkFabricType = defaults.networkFabricType;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder networkFabricType(@Nullable Output<EnvironmentNetworkFabricType> networkFabricType) {
            this.networkFabricType = networkFabricType;
            return this;
        }

        public Builder networkFabricType(@Nullable EnvironmentNetworkFabricType networkFabricType) {
            this.networkFabricType = Output.ofNullable(networkFabricType);
            return this;
        }

        public Builder tags(@Nullable Output<List<EnvironmentTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<EnvironmentTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public EnvironmentArgs build() {
            return new EnvironmentArgs(description, name, networkFabricType, tags);
        }
    }
}
