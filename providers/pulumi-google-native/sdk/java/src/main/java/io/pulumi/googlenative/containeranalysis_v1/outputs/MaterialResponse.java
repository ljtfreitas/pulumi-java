// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class MaterialResponse {
    private final Map<String,String> digest;
    private final String uri;

    @OutputCustomType.Constructor({"digest","uri"})
    private MaterialResponse(
        Map<String,String> digest,
        String uri) {
        this.digest = Objects.requireNonNull(digest);
        this.uri = Objects.requireNonNull(uri);
    }

    public Map<String,String> getDigest() {
        return this.digest;
    }
    public String getUri() {
        return this.uri;
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
