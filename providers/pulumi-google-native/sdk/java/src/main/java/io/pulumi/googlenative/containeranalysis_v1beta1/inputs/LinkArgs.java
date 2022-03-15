// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.ByProductsArgs;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.EnvironmentArgs;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.GrafeasV1beta1IntotoArtifactArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This corresponds to an in-toto link.
 * 
 */
public final class LinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final LinkArgs Empty = new LinkArgs();

    /**
     * ByProducts are data generated as part of a software supply chain step, but are not the actual result of the step.
     * 
     */
    @Import(name="byproducts")
      private final @Nullable Output<ByProductsArgs> byproducts;

    public Output<ByProductsArgs> getByproducts() {
        return this.byproducts == null ? Output.empty() : this.byproducts;
    }

    /**
     * This field contains the full command executed for the step. This can also be empty if links are generated for operations that aren't directly mapped to a specific command. Each term in the command is an independent string in the list. An example of a command in the in-toto metadata field is: "command": ["git", "clone", "https://github.com/in-toto/demo-project.git"]
     * 
     */
    @Import(name="command")
      private final @Nullable Output<List<String>> command;

    public Output<List<String>> getCommand() {
        return this.command == null ? Output.empty() : this.command;
    }

    /**
     * This is a field that can be used to capture information about the environment. It is suggested for this field to contain information that details environment variables, filesystem information, and the present working directory. The recommended structure of this field is: "environment": { "custom_values": { "variables": "", "filesystem": "", "workdir": "", "": "..." } }
     * 
     */
    @Import(name="environment")
      private final @Nullable Output<EnvironmentArgs> environment;

    public Output<EnvironmentArgs> getEnvironment() {
        return this.environment == null ? Output.empty() : this.environment;
    }

    /**
     * Materials are the supply chain artifacts that go into the step and are used for the operation performed. The key of the map is the path of the artifact and the structure contains the recorded hash information. An example is: "materials": [ { "resource_uri": "foo/bar", "hashes": { "sha256": "ebebf...", : } } ]
     * 
     */
    @Import(name="materials")
      private final @Nullable Output<List<GrafeasV1beta1IntotoArtifactArgs>> materials;

    public Output<List<GrafeasV1beta1IntotoArtifactArgs>> getMaterials() {
        return this.materials == null ? Output.empty() : this.materials;
    }

    /**
     * Products are the supply chain artifacts generated as a result of the step. The structure is identical to that of materials.
     * 
     */
    @Import(name="products")
      private final @Nullable Output<List<GrafeasV1beta1IntotoArtifactArgs>> products;

    public Output<List<GrafeasV1beta1IntotoArtifactArgs>> getProducts() {
        return this.products == null ? Output.empty() : this.products;
    }

    public LinkArgs(
        @Nullable Output<ByProductsArgs> byproducts,
        @Nullable Output<List<String>> command,
        @Nullable Output<EnvironmentArgs> environment,
        @Nullable Output<List<GrafeasV1beta1IntotoArtifactArgs>> materials,
        @Nullable Output<List<GrafeasV1beta1IntotoArtifactArgs>> products) {
        this.byproducts = byproducts;
        this.command = command;
        this.environment = environment;
        this.materials = materials;
        this.products = products;
    }

    private LinkArgs() {
        this.byproducts = Output.empty();
        this.command = Output.empty();
        this.environment = Output.empty();
        this.materials = Output.empty();
        this.products = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ByProductsArgs> byproducts;
        private @Nullable Output<List<String>> command;
        private @Nullable Output<EnvironmentArgs> environment;
        private @Nullable Output<List<GrafeasV1beta1IntotoArtifactArgs>> materials;
        private @Nullable Output<List<GrafeasV1beta1IntotoArtifactArgs>> products;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.byproducts = defaults.byproducts;
    	      this.command = defaults.command;
    	      this.environment = defaults.environment;
    	      this.materials = defaults.materials;
    	      this.products = defaults.products;
        }

        public Builder byproducts(@Nullable Output<ByProductsArgs> byproducts) {
            this.byproducts = byproducts;
            return this;
        }

        public Builder byproducts(@Nullable ByProductsArgs byproducts) {
            this.byproducts = Output.ofNullable(byproducts);
            return this;
        }

        public Builder command(@Nullable Output<List<String>> command) {
            this.command = command;
            return this;
        }

        public Builder command(@Nullable List<String> command) {
            this.command = Output.ofNullable(command);
            return this;
        }

        public Builder environment(@Nullable Output<EnvironmentArgs> environment) {
            this.environment = environment;
            return this;
        }

        public Builder environment(@Nullable EnvironmentArgs environment) {
            this.environment = Output.ofNullable(environment);
            return this;
        }

        public Builder materials(@Nullable Output<List<GrafeasV1beta1IntotoArtifactArgs>> materials) {
            this.materials = materials;
            return this;
        }

        public Builder materials(@Nullable List<GrafeasV1beta1IntotoArtifactArgs> materials) {
            this.materials = Output.ofNullable(materials);
            return this;
        }

        public Builder products(@Nullable Output<List<GrafeasV1beta1IntotoArtifactArgs>> products) {
            this.products = products;
            return this;
        }

        public Builder products(@Nullable List<GrafeasV1beta1IntotoArtifactArgs> products) {
            this.products = Output.ofNullable(products);
            return this;
        }
        public LinkArgs build() {
            return new LinkArgs(byproducts, command, environment, materials, products);
        }
    }
}
