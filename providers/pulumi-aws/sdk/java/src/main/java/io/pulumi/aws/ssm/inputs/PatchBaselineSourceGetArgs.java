// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class PatchBaselineSourceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchBaselineSourceGetArgs Empty = new PatchBaselineSourceGetArgs();

    /**
     * The value of the yum repo configuration. For information about other options available for your yum repository configuration, see the [`dnf.conf` documentation](https://man7.org/linux/man-pages/man5/dnf.conf.5.html)
     * 
     */
    @Import(name="configuration", required=true)
      private final Output<String> configuration;

    public Output<String> getConfiguration() {
        return this.configuration;
    }

    /**
     * The name specified to identify the patch source.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * The specific operating system versions a patch repository applies to, such as `"Ubuntu16.04"`, `"AmazonLinux2016.09"`, `"RedhatEnterpriseLinux7.2"` or `"Suse12.7"`. For lists of supported product values, see [PatchFilter](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html).
     * 
     */
    @Import(name="products", required=true)
      private final Output<List<String>> products;

    public Output<List<String>> getProducts() {
        return this.products;
    }

    public PatchBaselineSourceGetArgs(
        Output<String> configuration,
        Output<String> name,
        Output<List<String>> products) {
        this.configuration = Objects.requireNonNull(configuration, "expected parameter 'configuration' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.products = Objects.requireNonNull(products, "expected parameter 'products' to be non-null");
    }

    private PatchBaselineSourceGetArgs() {
        this.configuration = Output.empty();
        this.name = Output.empty();
        this.products = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchBaselineSourceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> configuration;
        private Output<String> name;
        private Output<List<String>> products;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchBaselineSourceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.name = defaults.name;
    	      this.products = defaults.products;
        }

        public Builder configuration(Output<String> configuration) {
            this.configuration = Objects.requireNonNull(configuration);
            return this;
        }

        public Builder configuration(String configuration) {
            this.configuration = Output.of(Objects.requireNonNull(configuration));
            return this;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder products(Output<List<String>> products) {
            this.products = Objects.requireNonNull(products);
            return this;
        }

        public Builder products(List<String> products) {
            this.products = Output.of(Objects.requireNonNull(products));
            return this;
        }
        public PatchBaselineSourceGetArgs build() {
            return new PatchBaselineSourceGetArgs(configuration, name, products);
        }
    }
}
