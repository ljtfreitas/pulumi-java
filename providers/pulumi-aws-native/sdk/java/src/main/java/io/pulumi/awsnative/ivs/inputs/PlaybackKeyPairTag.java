// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ivs.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class PlaybackKeyPairTag extends io.pulumi.resources.InvokeArgs {

    public static final PlaybackKeyPairTag Empty = new PlaybackKeyPairTag();

    @InputImport(name="key", required=true)
        private final String key;

    public String getKey() {
        return this.key;
    }

    @InputImport(name="value", required=true)
        private final String value;

    public String getValue() {
        return this.value;
    }

    public PlaybackKeyPairTag(
        String key,
        String value) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private PlaybackKeyPairTag() {
        this.key = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PlaybackKeyPairTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(PlaybackKeyPairTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public PlaybackKeyPairTag build() {
            return new PlaybackKeyPairTag(key, value);
        }
    }
}
