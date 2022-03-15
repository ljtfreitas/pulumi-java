// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datasync.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NfsLocationMountOptions {
    /**
     * The specific NFS version that you want DataSync to use for mounting your NFS share. Valid values: `AUTOMATIC`, `NFS3`, `NFS4_0` and `NFS4_1`. Default: `AUTOMATIC`
     * 
     */
    private final @Nullable String version;

    @CustomType.Constructor
    private NfsLocationMountOptions(@CustomType.Parameter("version") @Nullable String version) {
        this.version = version;
    }

    /**
     * The specific NFS version that you want DataSync to use for mounting your NFS share. Valid values: `AUTOMATIC`, `NFS3`, `NFS4_0` and `NFS4_1`. Default: `AUTOMATIC`
     * 
    */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NfsLocationMountOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(NfsLocationMountOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.version = defaults.version;
        }

        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }
        public NfsLocationMountOptions build() {
            return new NfsLocationMountOptions(version);
        }
    }
}
