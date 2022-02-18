// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ExportPolicyRuleResponse {
    /**
     * Client ingress specification as comma separated string with IPv4 CIDRs, IPv4 host addresses and host names
     * 
     */
    private final @Nullable String allowedClients;
    /**
     * Allows CIFS protocol
     * 
     */
    private final @Nullable Boolean cifs;
    /**
     * Has root access to volume
     * 
     */
    private final @Nullable Boolean hasRootAccess;
    /**
     * Kerberos5 Read only access. To be use with swagger version 2020-05-01 or later
     * 
     */
    private final @Nullable Boolean kerberos5ReadOnly;
    /**
     * Kerberos5 Read and write access. To be use with swagger version 2020-05-01 or later
     * 
     */
    private final @Nullable Boolean kerberos5ReadWrite;
    /**
     * Kerberos5i Read only access. To be use with swagger version 2020-05-01 or later
     * 
     */
    private final @Nullable Boolean kerberos5iReadOnly;
    /**
     * Kerberos5i Read and write access. To be use with swagger version 2020-05-01 or later
     * 
     */
    private final @Nullable Boolean kerberos5iReadWrite;
    /**
     * Kerberos5p Read only access. To be use with swagger version 2020-05-01 or later
     * 
     */
    private final @Nullable Boolean kerberos5pReadOnly;
    /**
     * Kerberos5p Read and write access. To be use with swagger version 2020-05-01 or later
     * 
     */
    private final @Nullable Boolean kerberos5pReadWrite;
    /**
     * Allows NFSv3 protocol. Enable only for NFSv3 type volumes
     * 
     */
    private final @Nullable Boolean nfsv3;
    /**
     * Allows NFSv4.1 protocol. Enable only for NFSv4.1 type volumes
     * 
     */
    private final @Nullable Boolean nfsv41;
    /**
     * Order index
     * 
     */
    private final @Nullable Integer ruleIndex;
    /**
     * Read only access
     * 
     */
    private final @Nullable Boolean unixReadOnly;
    /**
     * Read and write access
     * 
     */
    private final @Nullable Boolean unixReadWrite;

    @OutputCustomType.Constructor({"allowedClients","cifs","hasRootAccess","kerberos5ReadOnly","kerberos5ReadWrite","kerberos5iReadOnly","kerberos5iReadWrite","kerberos5pReadOnly","kerberos5pReadWrite","nfsv3","nfsv41","ruleIndex","unixReadOnly","unixReadWrite"})
    private ExportPolicyRuleResponse(
        @Nullable String allowedClients,
        @Nullable Boolean cifs,
        @Nullable Boolean hasRootAccess,
        @Nullable Boolean kerberos5ReadOnly,
        @Nullable Boolean kerberos5ReadWrite,
        @Nullable Boolean kerberos5iReadOnly,
        @Nullable Boolean kerberos5iReadWrite,
        @Nullable Boolean kerberos5pReadOnly,
        @Nullable Boolean kerberos5pReadWrite,
        @Nullable Boolean nfsv3,
        @Nullable Boolean nfsv41,
        @Nullable Integer ruleIndex,
        @Nullable Boolean unixReadOnly,
        @Nullable Boolean unixReadWrite) {
        this.allowedClients = allowedClients;
        this.cifs = cifs;
        this.hasRootAccess = hasRootAccess;
        this.kerberos5ReadOnly = kerberos5ReadOnly;
        this.kerberos5ReadWrite = kerberos5ReadWrite;
        this.kerberos5iReadOnly = kerberos5iReadOnly;
        this.kerberos5iReadWrite = kerberos5iReadWrite;
        this.kerberos5pReadOnly = kerberos5pReadOnly;
        this.kerberos5pReadWrite = kerberos5pReadWrite;
        this.nfsv3 = nfsv3;
        this.nfsv41 = nfsv41;
        this.ruleIndex = ruleIndex;
        this.unixReadOnly = unixReadOnly;
        this.unixReadWrite = unixReadWrite;
    }

    /**
     * Client ingress specification as comma separated string with IPv4 CIDRs, IPv4 host addresses and host names
     * 
     */
    public Optional<String> getAllowedClients() {
        return Optional.ofNullable(this.allowedClients);
    }
    /**
     * Allows CIFS protocol
     * 
     */
    public Optional<Boolean> getCifs() {
        return Optional.ofNullable(this.cifs);
    }
    /**
     * Has root access to volume
     * 
     */
    public Optional<Boolean> getHasRootAccess() {
        return Optional.ofNullable(this.hasRootAccess);
    }
    /**
     * Kerberos5 Read only access. To be use with swagger version 2020-05-01 or later
     * 
     */
    public Optional<Boolean> getKerberos5ReadOnly() {
        return Optional.ofNullable(this.kerberos5ReadOnly);
    }
    /**
     * Kerberos5 Read and write access. To be use with swagger version 2020-05-01 or later
     * 
     */
    public Optional<Boolean> getKerberos5ReadWrite() {
        return Optional.ofNullable(this.kerberos5ReadWrite);
    }
    /**
     * Kerberos5i Read only access. To be use with swagger version 2020-05-01 or later
     * 
     */
    public Optional<Boolean> getKerberos5iReadOnly() {
        return Optional.ofNullable(this.kerberos5iReadOnly);
    }
    /**
     * Kerberos5i Read and write access. To be use with swagger version 2020-05-01 or later
     * 
     */
    public Optional<Boolean> getKerberos5iReadWrite() {
        return Optional.ofNullable(this.kerberos5iReadWrite);
    }
    /**
     * Kerberos5p Read only access. To be use with swagger version 2020-05-01 or later
     * 
     */
    public Optional<Boolean> getKerberos5pReadOnly() {
        return Optional.ofNullable(this.kerberos5pReadOnly);
    }
    /**
     * Kerberos5p Read and write access. To be use with swagger version 2020-05-01 or later
     * 
     */
    public Optional<Boolean> getKerberos5pReadWrite() {
        return Optional.ofNullable(this.kerberos5pReadWrite);
    }
    /**
     * Allows NFSv3 protocol. Enable only for NFSv3 type volumes
     * 
     */
    public Optional<Boolean> getNfsv3() {
        return Optional.ofNullable(this.nfsv3);
    }
    /**
     * Allows NFSv4.1 protocol. Enable only for NFSv4.1 type volumes
     * 
     */
    public Optional<Boolean> getNfsv41() {
        return Optional.ofNullable(this.nfsv41);
    }
    /**
     * Order index
     * 
     */
    public Optional<Integer> getRuleIndex() {
        return Optional.ofNullable(this.ruleIndex);
    }
    /**
     * Read only access
     * 
     */
    public Optional<Boolean> getUnixReadOnly() {
        return Optional.ofNullable(this.unixReadOnly);
    }
    /**
     * Read and write access
     * 
     */
    public Optional<Boolean> getUnixReadWrite() {
        return Optional.ofNullable(this.unixReadWrite);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExportPolicyRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String allowedClients;
        private @Nullable Boolean cifs;
        private @Nullable Boolean hasRootAccess;
        private @Nullable Boolean kerberos5ReadOnly;
        private @Nullable Boolean kerberos5ReadWrite;
        private @Nullable Boolean kerberos5iReadOnly;
        private @Nullable Boolean kerberos5iReadWrite;
        private @Nullable Boolean kerberos5pReadOnly;
        private @Nullable Boolean kerberos5pReadWrite;
        private @Nullable Boolean nfsv3;
        private @Nullable Boolean nfsv41;
        private @Nullable Integer ruleIndex;
        private @Nullable Boolean unixReadOnly;
        private @Nullable Boolean unixReadWrite;

        public Builder() {
    	      // Empty
        }

        public Builder(ExportPolicyRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedClients = defaults.allowedClients;
    	      this.cifs = defaults.cifs;
    	      this.hasRootAccess = defaults.hasRootAccess;
    	      this.kerberos5ReadOnly = defaults.kerberos5ReadOnly;
    	      this.kerberos5ReadWrite = defaults.kerberos5ReadWrite;
    	      this.kerberos5iReadOnly = defaults.kerberos5iReadOnly;
    	      this.kerberos5iReadWrite = defaults.kerberos5iReadWrite;
    	      this.kerberos5pReadOnly = defaults.kerberos5pReadOnly;
    	      this.kerberos5pReadWrite = defaults.kerberos5pReadWrite;
    	      this.nfsv3 = defaults.nfsv3;
    	      this.nfsv41 = defaults.nfsv41;
    	      this.ruleIndex = defaults.ruleIndex;
    	      this.unixReadOnly = defaults.unixReadOnly;
    	      this.unixReadWrite = defaults.unixReadWrite;
        }

        public Builder setAllowedClients(@Nullable String allowedClients) {
            this.allowedClients = allowedClients;
            return this;
        }

        public Builder setCifs(@Nullable Boolean cifs) {
            this.cifs = cifs;
            return this;
        }

        public Builder setHasRootAccess(@Nullable Boolean hasRootAccess) {
            this.hasRootAccess = hasRootAccess;
            return this;
        }

        public Builder setKerberos5ReadOnly(@Nullable Boolean kerberos5ReadOnly) {
            this.kerberos5ReadOnly = kerberos5ReadOnly;
            return this;
        }

        public Builder setKerberos5ReadWrite(@Nullable Boolean kerberos5ReadWrite) {
            this.kerberos5ReadWrite = kerberos5ReadWrite;
            return this;
        }

        public Builder setKerberos5iReadOnly(@Nullable Boolean kerberos5iReadOnly) {
            this.kerberos5iReadOnly = kerberos5iReadOnly;
            return this;
        }

        public Builder setKerberos5iReadWrite(@Nullable Boolean kerberos5iReadWrite) {
            this.kerberos5iReadWrite = kerberos5iReadWrite;
            return this;
        }

        public Builder setKerberos5pReadOnly(@Nullable Boolean kerberos5pReadOnly) {
            this.kerberos5pReadOnly = kerberos5pReadOnly;
            return this;
        }

        public Builder setKerberos5pReadWrite(@Nullable Boolean kerberos5pReadWrite) {
            this.kerberos5pReadWrite = kerberos5pReadWrite;
            return this;
        }

        public Builder setNfsv3(@Nullable Boolean nfsv3) {
            this.nfsv3 = nfsv3;
            return this;
        }

        public Builder setNfsv41(@Nullable Boolean nfsv41) {
            this.nfsv41 = nfsv41;
            return this;
        }

        public Builder setRuleIndex(@Nullable Integer ruleIndex) {
            this.ruleIndex = ruleIndex;
            return this;
        }

        public Builder setUnixReadOnly(@Nullable Boolean unixReadOnly) {
            this.unixReadOnly = unixReadOnly;
            return this;
        }

        public Builder setUnixReadWrite(@Nullable Boolean unixReadWrite) {
            this.unixReadWrite = unixReadWrite;
            return this;
        }

        public ExportPolicyRuleResponse build() {
            return new ExportPolicyRuleResponse(allowedClients, cifs, hasRootAccess, kerberos5ReadOnly, kerberos5ReadWrite, kerberos5iReadOnly, kerberos5iReadWrite, kerberos5pReadOnly, kerberos5pReadWrite, nfsv3, nfsv41, ruleIndex, unixReadOnly, unixReadWrite);
        }
    }
}
