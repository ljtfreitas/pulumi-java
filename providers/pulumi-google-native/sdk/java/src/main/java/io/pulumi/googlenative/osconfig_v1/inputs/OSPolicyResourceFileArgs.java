// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourceFileGcsArgs;
import io.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourceFileRemoteArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A remote or local file.
 * 
 */
public final class OSPolicyResourceFileArgs extends io.pulumi.resources.ResourceArgs {

    public static final OSPolicyResourceFileArgs Empty = new OSPolicyResourceFileArgs();

    /**
     * Defaults to false. When false, files are subject to validations based on the file type: Remote: A checksum must be specified. Cloud Storage: An object generation number must be specified.
     * 
     */
    @InputImport(name="allowInsecure")
      private final @Nullable Input<Boolean> allowInsecure;

    public Input<Boolean> getAllowInsecure() {
        return this.allowInsecure == null ? Input.empty() : this.allowInsecure;
    }

    /**
     * A Cloud Storage object.
     * 
     */
    @InputImport(name="gcs")
      private final @Nullable Input<OSPolicyResourceFileGcsArgs> gcs;

    public Input<OSPolicyResourceFileGcsArgs> getGcs() {
        return this.gcs == null ? Input.empty() : this.gcs;
    }

    /**
     * A local path within the VM to use.
     * 
     */
    @InputImport(name="localPath")
      private final @Nullable Input<String> localPath;

    public Input<String> getLocalPath() {
        return this.localPath == null ? Input.empty() : this.localPath;
    }

    /**
     * A generic remote file.
     * 
     */
    @InputImport(name="remote")
      private final @Nullable Input<OSPolicyResourceFileRemoteArgs> remote;

    public Input<OSPolicyResourceFileRemoteArgs> getRemote() {
        return this.remote == null ? Input.empty() : this.remote;
    }

    public OSPolicyResourceFileArgs(
        @Nullable Input<Boolean> allowInsecure,
        @Nullable Input<OSPolicyResourceFileGcsArgs> gcs,
        @Nullable Input<String> localPath,
        @Nullable Input<OSPolicyResourceFileRemoteArgs> remote) {
        this.allowInsecure = allowInsecure;
        this.gcs = gcs;
        this.localPath = localPath;
        this.remote = remote;
    }

    private OSPolicyResourceFileArgs() {
        this.allowInsecure = Input.empty();
        this.gcs = Input.empty();
        this.localPath = Input.empty();
        this.remote = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowInsecure;
        private @Nullable Input<OSPolicyResourceFileGcsArgs> gcs;
        private @Nullable Input<String> localPath;
        private @Nullable Input<OSPolicyResourceFileRemoteArgs> remote;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceFileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowInsecure = defaults.allowInsecure;
    	      this.gcs = defaults.gcs;
    	      this.localPath = defaults.localPath;
    	      this.remote = defaults.remote;
        }

        public Builder setAllowInsecure(@Nullable Input<Boolean> allowInsecure) {
            this.allowInsecure = allowInsecure;
            return this;
        }

        public Builder setAllowInsecure(@Nullable Boolean allowInsecure) {
            this.allowInsecure = Input.ofNullable(allowInsecure);
            return this;
        }

        public Builder setGcs(@Nullable Input<OSPolicyResourceFileGcsArgs> gcs) {
            this.gcs = gcs;
            return this;
        }

        public Builder setGcs(@Nullable OSPolicyResourceFileGcsArgs gcs) {
            this.gcs = Input.ofNullable(gcs);
            return this;
        }

        public Builder setLocalPath(@Nullable Input<String> localPath) {
            this.localPath = localPath;
            return this;
        }

        public Builder setLocalPath(@Nullable String localPath) {
            this.localPath = Input.ofNullable(localPath);
            return this;
        }

        public Builder setRemote(@Nullable Input<OSPolicyResourceFileRemoteArgs> remote) {
            this.remote = remote;
            return this;
        }

        public Builder setRemote(@Nullable OSPolicyResourceFileRemoteArgs remote) {
            this.remote = Input.ofNullable(remote);
            return this;
        }
        public OSPolicyResourceFileArgs build() {
            return new OSPolicyResourceFileArgs(allowInsecure, gcs, localPath, remote);
        }
    }
}
