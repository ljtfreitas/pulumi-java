// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetManagerDevicePublicEncryptionKeyResult {
    /**
     * The key.
     * 
     */
    private final String key;

    @CustomType.Constructor
    private GetManagerDevicePublicEncryptionKeyResult(@CustomType.Parameter("key") String key) {
        this.key = key;
    }

    /**
     * The key.
     * 
    */
    public String getKey() {
        return this.key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagerDevicePublicEncryptionKeyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagerDevicePublicEncryptionKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public GetManagerDevicePublicEncryptionKeyResult build() {
            return new GetManagerDevicePublicEncryptionKeyResult(key);
        }
    }
}
