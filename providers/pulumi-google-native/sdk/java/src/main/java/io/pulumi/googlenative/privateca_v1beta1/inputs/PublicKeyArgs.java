// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.privateca_v1beta1.enums.PublicKeyType;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A PublicKey describes a public key.
 * 
 */
public final class PublicKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final PublicKeyArgs Empty = new PublicKeyArgs();

    /**
     * A public key. When this is specified in a request, the padding and encoding can be any of the options described by the respective 'KeyType' value. When this is generated by the service, it will always be an RFC 5280 [SubjectPublicKeyInfo](https://tools.ietf.org/html/rfc5280#section-4.1) structure containing an algorithm identifier and a key.
     * 
     */
    @Import(name="key", required=true)
      private final Output<String> key;

    public Output<String> getKey() {
        return this.key;
    }

    /**
     * Optional. The type of public key. If specified, it must match the public key used for the`key` field.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<PublicKeyType> type;

    public Output<PublicKeyType> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public PublicKeyArgs(
        Output<String> key,
        @Nullable Output<PublicKeyType> type) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.type = type;
    }

    private PublicKeyArgs() {
        this.key = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> key;
        private @Nullable Output<PublicKeyType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(PublicKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.type = defaults.type;
        }

        public Builder key(Output<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder key(String key) {
            this.key = Output.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder type(@Nullable Output<PublicKeyType> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable PublicKeyType type) {
            this.type = Output.ofNullable(type);
            return this;
        }
        public PublicKeyArgs build() {
            return new PublicKeyArgs(key, type);
        }
    }
}
