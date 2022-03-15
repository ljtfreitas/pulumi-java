// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a Goo package repository. These is added to a repo file that is stored at C:/ProgramData/GooGet/repos/google_osconfig.repo.
 * 
 */
public final class GooRepositoryResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooRepositoryResponse Empty = new GooRepositoryResponse();

    /**
     * The name of the repository.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The url of the repository.
     * 
     */
    @Import(name="url", required=true)
      private final String url;

    public String getUrl() {
        return this.url;
    }

    public GooRepositoryResponse(
        String name,
        String url) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private GooRepositoryResponse() {
        this.name = null;
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooRepositoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GooRepositoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.url = defaults.url;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public GooRepositoryResponse build() {
            return new GooRepositoryResponse(name, url);
        }
    }
}
