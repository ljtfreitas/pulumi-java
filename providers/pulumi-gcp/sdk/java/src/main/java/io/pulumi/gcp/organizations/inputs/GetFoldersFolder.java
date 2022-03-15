// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFoldersFolder extends io.pulumi.resources.InvokeArgs {

    public static final GetFoldersFolder Empty = new GetFoldersFolder();

    /**
     * The timestamp of when the folder was created
     * 
     */
    @Import(name="createTime", required=true)
      private final String createTime;

    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * The timestamp of when the folder was requested to be deleted (if applicable)
     * 
     */
    @Import(name="deleteTime", required=true)
      private final String deleteTime;

    public String getDeleteTime() {
        return this.deleteTime;
    }

    /**
     * The display name of the folder
     * 
     */
    @Import(name="displayName", required=true)
      private final String displayName;

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Entity tag identifier of the folder
     * 
     */
    @Import(name="etag", required=true)
      private final String etag;

    public String getEtag() {
        return this.etag;
    }

    /**
     * The id of the folder
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The parent id of the folder
     * 
     */
    @Import(name="parent", required=true)
      private final String parent;

    public String getParent() {
        return this.parent;
    }

    /**
     * The lifecycle state of the folder
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String getState() {
        return this.state;
    }

    /**
     * The timestamp of when the folder was last modified
     * 
     */
    @Import(name="updateTime", required=true)
      private final String updateTime;

    public String getUpdateTime() {
        return this.updateTime;
    }

    public GetFoldersFolder(
        String createTime,
        String deleteTime,
        String displayName,
        String etag,
        String name,
        String parent,
        String state,
        String updateTime) {
        this.createTime = Objects.requireNonNull(createTime, "expected parameter 'createTime' to be non-null");
        this.deleteTime = Objects.requireNonNull(deleteTime, "expected parameter 'deleteTime' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parent = Objects.requireNonNull(parent, "expected parameter 'parent' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.updateTime = Objects.requireNonNull(updateTime, "expected parameter 'updateTime' to be non-null");
    }

    private GetFoldersFolder() {
        this.createTime = null;
        this.deleteTime = null;
        this.displayName = null;
        this.etag = null;
        this.name = null;
        this.parent = null;
        this.state = null;
        this.updateTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFoldersFolder defaults) {
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

        public Builder(GetFoldersFolder defaults) {
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
        public GetFoldersFolder build() {
            return new GetFoldersFolder(createTime, deleteTime, displayName, etag, name, parent, state, updateTime);
        }
    }
}
