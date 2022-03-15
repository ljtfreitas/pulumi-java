// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudresourcemanager_v3.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFolderResult {
    /**
     * Timestamp when the folder was created.
     * 
     */
    private final String createTime;
    /**
     * Timestamp when the folder was requested to be deleted.
     * 
     */
    private final String deleteTime;
    /**
     * The folder's display name. A folder's display name must be unique amongst its siblings. For example, no two folders with the same parent can share the same display name. The display name must start and end with a letter or digit, may contain letters, digits, spaces, hyphens and underscores and can be no longer than 30 characters. This is captured by the regular expression: `[\p{L}\p{N}]([\p{L}\p{N}_- ]{0,28}[\p{L}\p{N}])?`.
     * 
     */
    private final String displayName;
    /**
     * A checksum computed by the server based on the current value of the folder resource. This may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    private final String etag;
    /**
     * The resource name of the folder. Its format is `folders/{folder_id}`, for example: "folders/1234".
     * 
     */
    private final String name;
    /**
     * The folder's parent's resource name. Updates to the folder's parent must be performed using MoveFolder.
     * 
     */
    private final String parent;
    /**
     * The lifecycle state of the folder. Updates to the state must be performed using DeleteFolder and UndeleteFolder.
     * 
     */
    private final String state;
    /**
     * Timestamp when the folder was last modified.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetFolderResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("deleteTime") String deleteTime,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parent") String parent,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.deleteTime = deleteTime;
        this.displayName = displayName;
        this.etag = etag;
        this.name = name;
        this.parent = parent;
        this.state = state;
        this.updateTime = updateTime;
    }

    /**
     * Timestamp when the folder was created.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Timestamp when the folder was requested to be deleted.
     * 
    */
    public String getDeleteTime() {
        return this.deleteTime;
    }
    /**
     * The folder's display name. A folder's display name must be unique amongst its siblings. For example, no two folders with the same parent can share the same display name. The display name must start and end with a letter or digit, may contain letters, digits, spaces, hyphens and underscores and can be no longer than 30 characters. This is captured by the regular expression: `[\p{L}\p{N}]([\p{L}\p{N}_- ]{0,28}[\p{L}\p{N}])?`.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * A checksum computed by the server based on the current value of the folder resource. This may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * The resource name of the folder. Its format is `folders/{folder_id}`, for example: "folders/1234".
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The folder's parent's resource name. Updates to the folder's parent must be performed using MoveFolder.
     * 
    */
    public String getParent() {
        return this.parent;
    }
    /**
     * The lifecycle state of the folder. Updates to the state must be performed using DeleteFolder and UndeleteFolder.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * Timestamp when the folder was last modified.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFolderResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String deleteTime;
        private String displayName;
        private String etag;
        private String name;
        private String parent;
        private String state;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFolderResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.deleteTime = defaults.deleteTime;
    	      this.displayName = defaults.displayName;
    	      this.etag = defaults.etag;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.state = defaults.state;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder deleteTime(String deleteTime) {
            this.deleteTime = Objects.requireNonNull(deleteTime);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder parent(String parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetFolderResult build() {
            return new GetFolderResult(createTime, deleteTime, displayName, etag, name, parent, state, updateTime);
        }
    }
}
