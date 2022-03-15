// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The custom domain assigned to this storage account. This can be set via Update.
 * 
 */
public final class CustomDomainResponse extends io.pulumi.resources.InvokeArgs {

    public static final CustomDomainResponse Empty = new CustomDomainResponse();

    /**
     * Gets or sets the custom domain name assigned to the storage account. Name is the CNAME source.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Indicates whether indirect CName validation is enabled. Default value is false. This should only be set on updates.
     * 
     */
    @Import(name="useSubDomainName")
      private final @Nullable Boolean useSubDomainName;

    public Optional<Boolean> getUseSubDomainName() {
        return this.useSubDomainName == null ? Optional.empty() : Optional.ofNullable(this.useSubDomainName);
    }

    public CustomDomainResponse(
        String name,
        @Nullable Boolean useSubDomainName) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.useSubDomainName = useSubDomainName;
    }

    private CustomDomainResponse() {
        this.name = null;
        this.useSubDomainName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomDomainResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable Boolean useSubDomainName;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomDomainResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.useSubDomainName = defaults.useSubDomainName;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder useSubDomainName(@Nullable Boolean useSubDomainName) {
            this.useSubDomainName = useSubDomainName;
            return this;
        }
        public CustomDomainResponse build() {
            return new CustomDomainResponse(name, useSubDomainName);
        }
    }
}
