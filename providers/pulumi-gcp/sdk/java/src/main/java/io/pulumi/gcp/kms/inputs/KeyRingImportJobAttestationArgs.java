// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KeyRingImportJobAttestationArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyRingImportJobAttestationArgs Empty = new KeyRingImportJobAttestationArgs();

    @Import(name="content")
      private final @Nullable Output<String> content;

    public Output<String> getContent() {
        return this.content == null ? Output.empty() : this.content;
    }

    @Import(name="format")
      private final @Nullable Output<String> format;

    public Output<String> getFormat() {
        return this.format == null ? Output.empty() : this.format;
    }

    public KeyRingImportJobAttestationArgs(
        @Nullable Output<String> content,
        @Nullable Output<String> format) {
        this.content = content;
        this.format = format;
    }

    private KeyRingImportJobAttestationArgs() {
        this.content = Output.empty();
        this.format = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyRingImportJobAttestationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> content;
        private @Nullable Output<String> format;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyRingImportJobAttestationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.format = defaults.format;
        }

        public Builder content(@Nullable Output<String> content) {
            this.content = content;
            return this;
        }

        public Builder content(@Nullable String content) {
            this.content = Output.ofNullable(content);
            return this;
        }

        public Builder format(@Nullable Output<String> format) {
            this.format = format;
            return this;
        }

        public Builder format(@Nullable String format) {
            this.format = Output.ofNullable(format);
            return this;
        }
        public KeyRingImportJobAttestationArgs build() {
            return new KeyRingImportJobAttestationArgs(content, format);
        }
    }
}
