// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CredentialReferenceResponse {
    /**
     * Reference credential name.
     * 
     */
    private final String referenceName;
    /**
     * Credential reference type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"referenceName","type"})
    private CredentialReferenceResponse(
        String referenceName,
        String type) {
        this.referenceName = Objects.requireNonNull(referenceName);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Reference credential name.
     * 
     */
    public String getReferenceName() {
        return this.referenceName;
    }
    /**
     * Credential reference type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CredentialReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String referenceName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(CredentialReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.referenceName = defaults.referenceName;
    	      this.type = defaults.type;
        }

        public Builder setReferenceName(String referenceName) {
            this.referenceName = Objects.requireNonNull(referenceName);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public CredentialReferenceResponse build() {
            return new CredentialReferenceResponse(referenceName, type);
        }
    }
}
