// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ImageBuilderDomainJoinInfo {
    /**
     * Fully qualified name of the directory (for example, corp.example.com).
     * 
     */
    private final @Nullable String directoryName;
    /**
     * Distinguished name of the organizational unit for computer accounts.
     * 
     */
    private final @Nullable String organizationalUnitDistinguishedName;

    @CustomType.Constructor
    private ImageBuilderDomainJoinInfo(
        @CustomType.Parameter("directoryName") @Nullable String directoryName,
        @CustomType.Parameter("organizationalUnitDistinguishedName") @Nullable String organizationalUnitDistinguishedName) {
        this.directoryName = directoryName;
        this.organizationalUnitDistinguishedName = organizationalUnitDistinguishedName;
    }

    /**
     * Fully qualified name of the directory (for example, corp.example.com).
     * 
    */
    public Optional<String> getDirectoryName() {
        return Optional.ofNullable(this.directoryName);
    }
    /**
     * Distinguished name of the organizational unit for computer accounts.
     * 
    */
    public Optional<String> getOrganizationalUnitDistinguishedName() {
        return Optional.ofNullable(this.organizationalUnitDistinguishedName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageBuilderDomainJoinInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String directoryName;
        private @Nullable String organizationalUnitDistinguishedName;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageBuilderDomainJoinInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.directoryName = defaults.directoryName;
    	      this.organizationalUnitDistinguishedName = defaults.organizationalUnitDistinguishedName;
        }

        public Builder directoryName(@Nullable String directoryName) {
            this.directoryName = directoryName;
            return this;
        }

        public Builder organizationalUnitDistinguishedName(@Nullable String organizationalUnitDistinguishedName) {
            this.organizationalUnitDistinguishedName = organizationalUnitDistinguishedName;
            return this;
        }
        public ImageBuilderDomainJoinInfo build() {
            return new ImageBuilderDomainJoinInfo(directoryName, organizationalUnitDistinguishedName);
        }
    }
}
