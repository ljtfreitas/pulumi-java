// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apikeys_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.apikeys_v2.outputs.V2RestrictionsResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetKeyResult {
    /**
     * A timestamp identifying the time this key was originally created.
     * 
     */
    private final String createTime;
    /**
     * A timestamp when this key was deleted. If the resource is not deleted, this must be empty.
     * 
     */
    private final String deleteTime;
    /**
     * Human-readable display name of this key that you can modify. The maximum length is 63 characters.
     * 
     */
    private final String displayName;
    /**
     * A checksum computed by the server based on the current value of the Key resource. This may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding. See https://google.aip.dev/154.
     * 
     */
    private final String etag;
    /**
     * An encrypted and signed value held by this key. This field can be accessed only through the `GetKeyString` method.
     * 
     */
    private final String keyString;
    /**
     * The resource name of the key. The `name` has the form: `projects//locations/global/keys/`. For example: `projects/123456867718/locations/global/keys/b7ff1f9f-8275-410a-94dd-3855ee9b5dd2` NOTE: Key is a global resource; hence the only supported value for location is `global`.
     * 
     */
    private final String name;
    /**
     * Key restrictions.
     * 
     */
    private final V2RestrictionsResponse restrictions;
    /**
     * Unique id in UUID4 format.
     * 
     */
    private final String uid;
    /**
     * A timestamp identifying the time this key was last updated.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor({"createTime","deleteTime","displayName","etag","keyString","name","restrictions","uid","updateTime"})
    private GetKeyResult(
        String createTime,
        String deleteTime,
        String displayName,
        String etag,
        String keyString,
        String name,
        V2RestrictionsResponse restrictions,
        String uid,
        String updateTime) {
        this.createTime = Objects.requireNonNull(createTime);
        this.deleteTime = Objects.requireNonNull(deleteTime);
        this.displayName = Objects.requireNonNull(displayName);
        this.etag = Objects.requireNonNull(etag);
        this.keyString = Objects.requireNonNull(keyString);
        this.name = Objects.requireNonNull(name);
        this.restrictions = Objects.requireNonNull(restrictions);
        this.uid = Objects.requireNonNull(uid);
        this.updateTime = Objects.requireNonNull(updateTime);
    }

    /**
     * A timestamp identifying the time this key was originally created.
     * 
     */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * A timestamp when this key was deleted. If the resource is not deleted, this must be empty.
     * 
     */
    public String getDeleteTime() {
        return this.deleteTime;
    }
    /**
     * Human-readable display name of this key that you can modify. The maximum length is 63 characters.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * A checksum computed by the server based on the current value of the Key resource. This may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding. See https://google.aip.dev/154.
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * An encrypted and signed value held by this key. This field can be accessed only through the `GetKeyString` method.
     * 
     */
    public String getKeyString() {
        return this.keyString;
    }
    /**
     * The resource name of the key. The `name` has the form: `projects//locations/global/keys/`. For example: `projects/123456867718/locations/global/keys/b7ff1f9f-8275-410a-94dd-3855ee9b5dd2` NOTE: Key is a global resource; hence the only supported value for location is `global`.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Key restrictions.
     * 
     */
    public V2RestrictionsResponse getRestrictions() {
        return this.restrictions;
    }
    /**
     * Unique id in UUID4 format.
     * 
     */
    public String getUid() {
        return this.uid;
    }
    /**
     * A timestamp identifying the time this key was last updated.
     * 
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String deleteTime;
        private String displayName;
        private String etag;
        private String keyString;
        private String name;
        private V2RestrictionsResponse restrictions;
        private String uid;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.deleteTime = defaults.deleteTime;
    	      this.displayName = defaults.displayName;
    	      this.etag = defaults.etag;
    	      this.keyString = defaults.keyString;
    	      this.name = defaults.name;
    	      this.restrictions = defaults.restrictions;
    	      this.uid = defaults.uid;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDeleteTime(String deleteTime) {
            this.deleteTime = Objects.requireNonNull(deleteTime);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setKeyString(String keyString) {
            this.keyString = Objects.requireNonNull(keyString);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRestrictions(V2RestrictionsResponse restrictions) {
            this.restrictions = Objects.requireNonNull(restrictions);
            return this;
        }

        public Builder setUid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetKeyResult build() {
            return new GetKeyResult(createTime, deleteTime, displayName, etag, keyString, name, restrictions, uid, updateTime);
        }
    }
}
