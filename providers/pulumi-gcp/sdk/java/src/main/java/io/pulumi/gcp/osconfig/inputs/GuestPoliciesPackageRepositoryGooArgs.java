// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GuestPoliciesPackageRepositoryGooArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesPackageRepositoryGooArgs Empty = new GuestPoliciesPackageRepositoryGooArgs();

    /**
     * Unique identifier for the recipe. Only one recipe with a given name is installed on an instance.
     * Names are also used to identify resources which helps to determine whether guest policies have conflicts.
     * This means that requests to create multiple recipes with the same name and version are rejected since they
     * could potentially have conflicting assignments.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * The url of the repository.
     * 
     */
    @Import(name="url", required=true)
      private final Output<String> url;

    public Output<String> getUrl() {
        return this.url;
    }

    public GuestPoliciesPackageRepositoryGooArgs(
        Output<String> name,
        Output<String> url) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private GuestPoliciesPackageRepositoryGooArgs() {
        this.name = Output.empty();
        this.url = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesPackageRepositoryGooArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private Output<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesPackageRepositoryGooArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.url = defaults.url;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder url(Output<String> url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public Builder url(String url) {
            this.url = Output.of(Objects.requireNonNull(url));
            return this;
        }
        public GuestPoliciesPackageRepositoryGooArgs build() {
            return new GuestPoliciesPackageRepositoryGooArgs(name, url);
        }
    }
}
