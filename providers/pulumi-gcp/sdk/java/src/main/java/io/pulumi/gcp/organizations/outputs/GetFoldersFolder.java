// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFoldersFolder {
    /**
     * The timestamp of when the folder was created
     * 
     */
    private final String createTime;
    /**
     * The timestamp of when the folder was requested to be deleted (if applicable)
     * 
     */
    private final String deleteTime;
    /**
     * The display name of the folder
     * 
     */
    private final String displayName;
    /**
     * Entity tag identifier of the folder
     * 
     */
    private final String etag;
    /**
     * The id of the folder
     * 
     */
    private final String name;
    /**
     * The parent id of the folder
     * 
     */
    private final String parent;
    /**
     * The lifecycle state of the folder
     * 
     */
    private final String state;
    /**
     * The timestamp of when the folder was last modified
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetFoldersFolder(
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
     * The timestamp of when the folder was created
     * 
    */
    public String createTime() {
        return this.createTime;
    }
    /**
     * The timestamp of when the folder was requested to be deleted (if applicable)
     * 
    */
    public String deleteTime() {
        return this.deleteTime;
    }
    /**
     * The display name of the folder
     * 
    */
    public String displayName() {
        return this.displayName;
    }
    /**
     * Entity tag identifier of the folder
     * 
    */
    public String etag() {
        return this.etag;
    }
    /**
     * The id of the folder
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The parent id of the folder
     * 
    */
    public String parent() {
        return this.parent;
    }
    /**
     * The lifecycle state of the folder
     * 
    */
    public String state() {
        return this.state;
    }
    /**
     * The timestamp of when the folder was last modified
     * 
    */
    public String updateTime() {
        return this.updateTime;
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
        }        public GetFoldersFolder build() {
            return new GetFoldersFolder(createTime, deleteTime, displayName, etag, name, parent, state, updateTime);
        }
    }
}
