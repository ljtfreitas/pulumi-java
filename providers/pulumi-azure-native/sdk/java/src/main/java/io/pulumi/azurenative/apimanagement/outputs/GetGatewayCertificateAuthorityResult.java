// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGatewayCertificateAuthorityResult {
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Determines whether certificate authority is trusted.
     * 
     */
    private final @Nullable Boolean isTrusted;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Resource type for API Management resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetGatewayCertificateAuthorityResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isTrusted") @Nullable Boolean isTrusted,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.isTrusted = isTrusted;
        this.name = name;
        this.type = type;
    }

    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Determines whether certificate authority is trusted.
     * 
    */
    public Optional<Boolean> getIsTrusted() {
        return Optional.ofNullable(this.isTrusted);
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Resource type for API Management resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayCertificateAuthorityResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable Boolean isTrusted;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGatewayCertificateAuthorityResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.isTrusted = defaults.isTrusted;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder isTrusted(@Nullable Boolean isTrusted) {
            this.isTrusted = isTrusted;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetGatewayCertificateAuthorityResult build() {
            return new GetGatewayCertificateAuthorityResult(id, isTrusted, name, type);
        }
    }
}
