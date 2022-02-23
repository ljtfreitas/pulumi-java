// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a Goo package repository. These are added to a repo file that is managed at `C:/ProgramData/GooGet/repos/google_osconfig.repo`.
 * 
 */
public final class OSPolicyResourceRepositoryResourceGooRepositoryResponse extends io.pulumi.resources.InvokeArgs {

    public static final OSPolicyResourceRepositoryResourceGooRepositoryResponse Empty = new OSPolicyResourceRepositoryResourceGooRepositoryResponse();

    /**
     * The name of the repository.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The url of the repository.
     * 
     */
    @InputImport(name="url", required=true)
      private final String url;

    public String getUrl() {
        return this.url;
    }

    public OSPolicyResourceRepositoryResourceGooRepositoryResponse(
        String name,
        String url) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private OSPolicyResourceRepositoryResourceGooRepositoryResponse() {
        this.name = null;
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceRepositoryResourceGooRepositoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceRepositoryResourceGooRepositoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.url = defaults.url;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public OSPolicyResourceRepositoryResourceGooRepositoryResponse build() {
            return new OSPolicyResourceRepositoryResourceGooRepositoryResponse(name, url);
        }
    }
}
