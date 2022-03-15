// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FleetDomainJoinInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetDomainJoinInfoArgs Empty = new FleetDomainJoinInfoArgs();

    /**
     * Fully qualified name of the directory (for example, corp.example.com).
     * 
     */
    @Import(name="directoryName")
      private final @Nullable Output<String> directoryName;

    public Output<String> getDirectoryName() {
        return this.directoryName == null ? Output.empty() : this.directoryName;
    }

    /**
     * Distinguished name of the organizational unit for computer accounts.
     * 
     */
    @Import(name="organizationalUnitDistinguishedName")
      private final @Nullable Output<String> organizationalUnitDistinguishedName;

    public Output<String> getOrganizationalUnitDistinguishedName() {
        return this.organizationalUnitDistinguishedName == null ? Output.empty() : this.organizationalUnitDistinguishedName;
    }

    public FleetDomainJoinInfoArgs(
        @Nullable Output<String> directoryName,
        @Nullable Output<String> organizationalUnitDistinguishedName) {
        this.directoryName = directoryName;
        this.organizationalUnitDistinguishedName = organizationalUnitDistinguishedName;
    }

    private FleetDomainJoinInfoArgs() {
        this.directoryName = Output.empty();
        this.organizationalUnitDistinguishedName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetDomainJoinInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> directoryName;
        private @Nullable Output<String> organizationalUnitDistinguishedName;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetDomainJoinInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.directoryName = defaults.directoryName;
    	      this.organizationalUnitDistinguishedName = defaults.organizationalUnitDistinguishedName;
        }

        public Builder directoryName(@Nullable Output<String> directoryName) {
            this.directoryName = directoryName;
            return this;
        }

        public Builder directoryName(@Nullable String directoryName) {
            this.directoryName = Output.ofNullable(directoryName);
            return this;
        }

        public Builder organizationalUnitDistinguishedName(@Nullable Output<String> organizationalUnitDistinguishedName) {
            this.organizationalUnitDistinguishedName = organizationalUnitDistinguishedName;
            return this;
        }

        public Builder organizationalUnitDistinguishedName(@Nullable String organizationalUnitDistinguishedName) {
            this.organizationalUnitDistinguishedName = Output.ofNullable(organizationalUnitDistinguishedName);
            return this;
        }
        public FleetDomainJoinInfoArgs build() {
            return new FleetDomainJoinInfoArgs(directoryName, organizationalUnitDistinguishedName);
        }
    }
}
