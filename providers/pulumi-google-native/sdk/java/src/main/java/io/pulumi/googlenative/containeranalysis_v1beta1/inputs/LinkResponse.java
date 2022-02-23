// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.ByProductsResponse;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.EnvironmentResponse;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.GrafeasV1beta1IntotoArtifactResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * This corresponds to an in-toto link.
 * 
 */
public final class LinkResponse extends io.pulumi.resources.InvokeArgs {

    public static final LinkResponse Empty = new LinkResponse();

    /**
     * ByProducts are data generated as part of a software supply chain step, but are not the actual result of the step.
     * 
     */
    @InputImport(name="byproducts", required=true)
      private final ByProductsResponse byproducts;

    public ByProductsResponse getByproducts() {
        return this.byproducts;
    }

    /**
     * This field contains the full command executed for the step. This can also be empty if links are generated for operations that aren't directly mapped to a specific command. Each term in the command is an independent string in the list. An example of a command in the in-toto metadata field is: "command": ["git", "clone", "https://github.com/in-toto/demo-project.git"]
     * 
     */
    @InputImport(name="command", required=true)
      private final List<String> command;

    public List<String> getCommand() {
        return this.command;
    }

    /**
     * This is a field that can be used to capture information about the environment. It is suggested for this field to contain information that details environment variables, filesystem information, and the present working directory. The recommended structure of this field is: "environment": { "custom_values": { "variables": "", "filesystem": "", "workdir": "", "": "..." } }
     * 
     */
    @InputImport(name="environment", required=true)
      private final EnvironmentResponse environment;

    public EnvironmentResponse getEnvironment() {
        return this.environment;
    }

    /**
     * Materials are the supply chain artifacts that go into the step and are used for the operation performed. The key of the map is the path of the artifact and the structure contains the recorded hash information. An example is: "materials": [ { "resource_uri": "foo/bar", "hashes": { "sha256": "ebebf...", : } } ]
     * 
     */
    @InputImport(name="materials", required=true)
      private final List<GrafeasV1beta1IntotoArtifactResponse> materials;

    public List<GrafeasV1beta1IntotoArtifactResponse> getMaterials() {
        return this.materials;
    }

    /**
     * Products are the supply chain artifacts generated as a result of the step. The structure is identical to that of materials.
     * 
     */
    @InputImport(name="products", required=true)
      private final List<GrafeasV1beta1IntotoArtifactResponse> products;

    public List<GrafeasV1beta1IntotoArtifactResponse> getProducts() {
        return this.products;
    }

    public LinkResponse(
        ByProductsResponse byproducts,
        List<String> command,
        EnvironmentResponse environment,
        List<GrafeasV1beta1IntotoArtifactResponse> materials,
        List<GrafeasV1beta1IntotoArtifactResponse> products) {
        this.byproducts = Objects.requireNonNull(byproducts, "expected parameter 'byproducts' to be non-null");
        this.command = Objects.requireNonNull(command, "expected parameter 'command' to be non-null");
        this.environment = Objects.requireNonNull(environment, "expected parameter 'environment' to be non-null");
        this.materials = Objects.requireNonNull(materials, "expected parameter 'materials' to be non-null");
        this.products = Objects.requireNonNull(products, "expected parameter 'products' to be non-null");
    }

    private LinkResponse() {
        this.byproducts = null;
        this.command = List.of();
        this.environment = null;
        this.materials = List.of();
        this.products = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ByProductsResponse byproducts;
        private List<String> command;
        private EnvironmentResponse environment;
        private List<GrafeasV1beta1IntotoArtifactResponse> materials;
        private List<GrafeasV1beta1IntotoArtifactResponse> products;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.byproducts = defaults.byproducts;
    	      this.command = defaults.command;
    	      this.environment = defaults.environment;
    	      this.materials = defaults.materials;
    	      this.products = defaults.products;
        }

        public Builder setByproducts(ByProductsResponse byproducts) {
            this.byproducts = Objects.requireNonNull(byproducts);
            return this;
        }

        public Builder setCommand(List<String> command) {
            this.command = Objects.requireNonNull(command);
            return this;
        }

        public Builder setEnvironment(EnvironmentResponse environment) {
            this.environment = Objects.requireNonNull(environment);
            return this;
        }

        public Builder setMaterials(List<GrafeasV1beta1IntotoArtifactResponse> materials) {
            this.materials = Objects.requireNonNull(materials);
            return this;
        }

        public Builder setProducts(List<GrafeasV1beta1IntotoArtifactResponse> products) {
            this.products = Objects.requireNonNull(products);
            return this;
        }
        public LinkResponse build() {
            return new LinkResponse(byproducts, command, environment, materials, products);
        }
    }
}
