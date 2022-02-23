// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.storagegateway.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NfsFileShareNfsFileShareDefaultsArgs extends io.pulumi.resources.ResourceArgs {

    public static final NfsFileShareNfsFileShareDefaultsArgs Empty = new NfsFileShareNfsFileShareDefaultsArgs();

    /**
     * The Unix directory mode in the string form "nnnn". Defaults to `"0777"`.
     * 
     */
    @InputImport(name="directoryMode")
    private final @Nullable Input<String> directoryMode;

    public Input<String> getDirectoryMode() {
        return this.directoryMode == null ? Input.empty() : this.directoryMode;
    }

    /**
     * The Unix file mode in the string form "nnnn". Defaults to `"0666"`.
     * 
     */
    @InputImport(name="fileMode")
    private final @Nullable Input<String> fileMode;

    public Input<String> getFileMode() {
        return this.fileMode == null ? Input.empty() : this.fileMode;
    }

    /**
     * The default group ID for the file share (unless the files have another group ID specified). Defaults to `65534` (`nfsnobody`). Valid values: `0` through `4294967294`.
     * 
     */
    @InputImport(name="groupId")
    private final @Nullable Input<String> groupId;

    public Input<String> getGroupId() {
        return this.groupId == null ? Input.empty() : this.groupId;
    }

    /**
     * The default owner ID for the file share (unless the files have another owner ID specified). Defaults to `65534` (`nfsnobody`). Valid values: `0` through `4294967294`.
     * 
     */
    @InputImport(name="ownerId")
    private final @Nullable Input<String> ownerId;

    public Input<String> getOwnerId() {
        return this.ownerId == null ? Input.empty() : this.ownerId;
    }

    public NfsFileShareNfsFileShareDefaultsArgs(
        @Nullable Input<String> directoryMode,
        @Nullable Input<String> fileMode,
        @Nullable Input<String> groupId,
        @Nullable Input<String> ownerId) {
        this.directoryMode = directoryMode;
        this.fileMode = fileMode;
        this.groupId = groupId;
        this.ownerId = ownerId;
    }

    private NfsFileShareNfsFileShareDefaultsArgs() {
        this.directoryMode = Input.empty();
        this.fileMode = Input.empty();
        this.groupId = Input.empty();
        this.ownerId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NfsFileShareNfsFileShareDefaultsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> directoryMode;
        private @Nullable Input<String> fileMode;
        private @Nullable Input<String> groupId;
        private @Nullable Input<String> ownerId;

        public Builder() {
    	      // Empty
        }

        public Builder(NfsFileShareNfsFileShareDefaultsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.directoryMode = defaults.directoryMode;
    	      this.fileMode = defaults.fileMode;
    	      this.groupId = defaults.groupId;
    	      this.ownerId = defaults.ownerId;
        }

        public Builder setDirectoryMode(@Nullable Input<String> directoryMode) {
            this.directoryMode = directoryMode;
            return this;
        }

        public Builder setDirectoryMode(@Nullable String directoryMode) {
            this.directoryMode = Input.ofNullable(directoryMode);
            return this;
        }

        public Builder setFileMode(@Nullable Input<String> fileMode) {
            this.fileMode = fileMode;
            return this;
        }

        public Builder setFileMode(@Nullable String fileMode) {
            this.fileMode = Input.ofNullable(fileMode);
            return this;
        }

        public Builder setGroupId(@Nullable Input<String> groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder setGroupId(@Nullable String groupId) {
            this.groupId = Input.ofNullable(groupId);
            return this;
        }

        public Builder setOwnerId(@Nullable Input<String> ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder setOwnerId(@Nullable String ownerId) {
            this.ownerId = Input.ofNullable(ownerId);
            return this;
        }
        public NfsFileShareNfsFileShareDefaultsArgs build() {
            return new NfsFileShareNfsFileShareDefaultsArgs(directoryMode, fileMode, groupId, ownerId);
        }
    }
}
