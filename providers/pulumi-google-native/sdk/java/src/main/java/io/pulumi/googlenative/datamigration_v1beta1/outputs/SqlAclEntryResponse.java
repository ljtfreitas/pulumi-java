// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SqlAclEntryResponse {
    /**
     * The time when this access control entry expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example: `2012-11-15T16:19:00.094Z`.
     * 
     */
    private final String expireTime;
    /**
     * A label to identify this entry.
     * 
     */
    private final String label;
    /**
     * Input only. The time-to-leave of this access control entry.
     * 
     */
    private final String ttl;
    /**
     * The allowlisted value for the access control list.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"expireTime","label","ttl","value"})
    private SqlAclEntryResponse(
        String expireTime,
        String label,
        String ttl,
        String value) {
        this.expireTime = Objects.requireNonNull(expireTime);
        this.label = Objects.requireNonNull(label);
        this.ttl = Objects.requireNonNull(ttl);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * The time when this access control entry expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example: `2012-11-15T16:19:00.094Z`.
     * 
     */
    public String getExpireTime() {
        return this.expireTime;
    }
    /**
     * A label to identify this entry.
     * 
     */
    public String getLabel() {
        return this.label;
    }
    /**
     * Input only. The time-to-leave of this access control entry.
     * 
     */
    public String getTtl() {
        return this.ttl;
    }
    /**
     * The allowlisted value for the access control list.
     * 
     */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlAclEntryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expireTime;
        private String label;
        private String ttl;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlAclEntryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expireTime = defaults.expireTime;
    	      this.label = defaults.label;
    	      this.ttl = defaults.ttl;
    	      this.value = defaults.value;
        }

        public Builder setExpireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }

        public Builder setLabel(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }

        public Builder setTtl(String ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public SqlAclEntryResponse build() {
            return new SqlAclEntryResponse(expireTime, label, ttl, value);
        }
    }
}
