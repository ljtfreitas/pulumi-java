// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.certificateauthority.outputs.AuthorityConfigX509ConfigAdditionalExtensionObjectId;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AuthorityConfigX509ConfigAdditionalExtension {
    /**
     * Indicates whether or not this extension is critical (i.e., if the client does not know how to
     * handle this extension, the client should consider this to be an error).
     * 
     */
    private final Boolean critical;
    /**
     * Describes values that are relevant in a CA certificate.
     * Structure is documented below.
     * 
     */
    private final AuthorityConfigX509ConfigAdditionalExtensionObjectId objectId;
    /**
     * The value of this X.509 extension. A base64-encoded string.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private AuthorityConfigX509ConfigAdditionalExtension(
        @CustomType.Parameter("critical") Boolean critical,
        @CustomType.Parameter("objectId") AuthorityConfigX509ConfigAdditionalExtensionObjectId objectId,
        @CustomType.Parameter("value") String value) {
        this.critical = critical;
        this.objectId = objectId;
        this.value = value;
    }

    /**
     * Indicates whether or not this extension is critical (i.e., if the client does not know how to
     * handle this extension, the client should consider this to be an error).
     * 
    */
    public Boolean getCritical() {
        return this.critical;
    }
    /**
     * Describes values that are relevant in a CA certificate.
     * Structure is documented below.
     * 
    */
    public AuthorityConfigX509ConfigAdditionalExtensionObjectId getObjectId() {
        return this.objectId;
    }
    /**
     * The value of this X.509 extension. A base64-encoded string.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorityConfigX509ConfigAdditionalExtension defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean critical;
        private AuthorityConfigX509ConfigAdditionalExtensionObjectId objectId;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorityConfigX509ConfigAdditionalExtension defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.critical = defaults.critical;
    	      this.objectId = defaults.objectId;
    	      this.value = defaults.value;
        }

        public Builder critical(Boolean critical) {
            this.critical = Objects.requireNonNull(critical);
            return this;
        }

        public Builder objectId(AuthorityConfigX509ConfigAdditionalExtensionObjectId objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public AuthorityConfigX509ConfigAdditionalExtension build() {
            return new AuthorityConfigX509ConfigAdditionalExtension(critical, objectId, value);
        }
    }
}
