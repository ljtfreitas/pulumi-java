// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ExportPolicyRuleResponse {
    private final @Nullable String allowedClients;
    private final @Nullable Boolean cifs;
    private final @Nullable Boolean hasRootAccess;
    private final @Nullable Boolean kerberos5ReadOnly;
    private final @Nullable Boolean kerberos5ReadWrite;
    private final @Nullable Boolean kerberos5iReadOnly;
    private final @Nullable Boolean kerberos5iReadWrite;
    private final @Nullable Boolean kerberos5pReadOnly;
    private final @Nullable Boolean kerberos5pReadWrite;
    private final @Nullable Boolean nfsv3;
    private final @Nullable Boolean nfsv41;
    private final @Nullable Integer ruleIndex;
    private final @Nullable Boolean unixReadOnly;
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

    public Optional<String> getAllowedClients() {
        return Optional.ofNullable(this.allowedClients);
    }
    public Optional<Boolean> getCifs() {
        return Optional.ofNullable(this.cifs);
    }
    public Optional<Boolean> getHasRootAccess() {
        return Optional.ofNullable(this.hasRootAccess);
    }
    public Optional<Boolean> getKerberos5ReadOnly() {
        return Optional.ofNullable(this.kerberos5ReadOnly);
    }
    public Optional<Boolean> getKerberos5ReadWrite() {
        return Optional.ofNullable(this.kerberos5ReadWrite);
    }
    public Optional<Boolean> getKerberos5iReadOnly() {
        return Optional.ofNullable(this.kerberos5iReadOnly);
    }
    public Optional<Boolean> getKerberos5iReadWrite() {
        return Optional.ofNullable(this.kerberos5iReadWrite);
    }
    public Optional<Boolean> getKerberos5pReadOnly() {
        return Optional.ofNullable(this.kerberos5pReadOnly);
    }
    public Optional<Boolean> getKerberos5pReadWrite() {
        return Optional.ofNullable(this.kerberos5pReadWrite);
    }
    public Optional<Boolean> getNfsv3() {
        return Optional.ofNullable(this.nfsv3);
    }
    public Optional<Boolean> getNfsv41() {
        return Optional.ofNullable(this.nfsv41);
    }
    public Optional<Integer> getRuleIndex() {
        return Optional.ofNullable(this.ruleIndex);
    }
    public Optional<Boolean> getUnixReadOnly() {
        return Optional.ofNullable(this.unixReadOnly);
    }
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