// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class MaterialResponse extends io.pulumi.resources.InvokeArgs {

    public static final MaterialResponse Empty = new MaterialResponse();

    @InputImport(name="digest", required=true)
      private final Map<String,String> digest;

    public Map<String,String> getDigest() {
        return this.digest;
    }

    @InputImport(name="uri", required=true)
      private final String uri;

    public String getUri() {
        return this.uri;
    }

    public MaterialResponse(
        Map<String,String> digest,
        String uri) {
        this.digest = Objects.requireNonNull(digest, "expected parameter 'digest' to be non-null");
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private MaterialResponse() {
        this.digest = Map.of();
        this.uri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaterialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> digest;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(MaterialResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.digest = defaults.digest;
    	      this.uri = defaults.uri;
        }

        public Builder setDigest(Map<String,String> digest) {
            this.digest = Objects.requireNonNull(digest);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public MaterialResponse build() {
            return new MaterialResponse(digest, uri);
        }
    }
}
