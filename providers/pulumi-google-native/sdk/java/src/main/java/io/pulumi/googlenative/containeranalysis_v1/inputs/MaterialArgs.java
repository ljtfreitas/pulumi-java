// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MaterialArgs extends io.pulumi.resources.ResourceArgs {

    public static final MaterialArgs Empty = new MaterialArgs();

    @Import(name="digest")
      private final @Nullable Output<Map<String,String>> digest;

    public Output<Map<String,String>> getDigest() {
        return this.digest == null ? Output.empty() : this.digest;
    }

    @Import(name="uri")
      private final @Nullable Output<String> uri;

    public Output<String> getUri() {
        return this.uri == null ? Output.empty() : this.uri;
    }

    public MaterialArgs(
        @Nullable Output<Map<String,String>> digest,
        @Nullable Output<String> uri) {
        this.digest = digest;
        this.uri = uri;
    }

    private MaterialArgs() {
        this.digest = Output.empty();
        this.uri = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaterialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> digest;
        private @Nullable Output<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(MaterialArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.digest = defaults.digest;
    	      this.uri = defaults.uri;
        }

        public Builder digest(@Nullable Output<Map<String,String>> digest) {
            this.digest = digest;
            return this;
        }

        public Builder digest(@Nullable Map<String,String> digest) {
            this.digest = Output.ofNullable(digest);
            return this;
        }

        public Builder uri(@Nullable Output<String> uri) {
            this.uri = uri;
            return this;
        }

        public Builder uri(@Nullable String uri) {
            this.uri = Output.ofNullable(uri);
            return this;
        }
        public MaterialArgs build() {
            return new MaterialArgs(digest, uri);
        }
    }
}
