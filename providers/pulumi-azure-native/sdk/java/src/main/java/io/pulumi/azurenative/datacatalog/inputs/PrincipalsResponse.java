// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datacatalog.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * User principals.
 * 
 */
public final class PrincipalsResponse extends io.pulumi.resources.InvokeArgs {

    public static final PrincipalsResponse Empty = new PrincipalsResponse();

    /**
     * Object Id for the user
     * 
     */
    @InputImport(name="objectId")
    private final @Nullable String objectId;

    public Optional<String> getObjectId() {
        return this.objectId == null ? Optional.empty() : Optional.ofNullable(this.objectId);
    }

    /**
     * UPN of the user.
     * 
     */
    @InputImport(name="upn")
    private final @Nullable String upn;

    public Optional<String> getUpn() {
        return this.upn == null ? Optional.empty() : Optional.ofNullable(this.upn);
    }

    public PrincipalsResponse(
        @Nullable String objectId,
        @Nullable String upn) {
        this.objectId = objectId;
        this.upn = upn;
    }

    private PrincipalsResponse() {
        this.objectId = null;
        this.upn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrincipalsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String objectId;
        private @Nullable String upn;

        public Builder() {
    	      // Empty
        }

        public Builder(PrincipalsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectId = defaults.objectId;
    	      this.upn = defaults.upn;
        }

        public Builder setObjectId(@Nullable String objectId) {
            this.objectId = objectId;
            return this;
        }

        public Builder setUpn(@Nullable String upn) {
            this.upn = upn;
            return this;
        }

        public PrincipalsResponse build() {
            return new PrincipalsResponse(objectId, upn);
        }
    }
}
