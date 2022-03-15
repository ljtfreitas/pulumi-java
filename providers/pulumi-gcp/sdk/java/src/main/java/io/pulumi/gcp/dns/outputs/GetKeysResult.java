// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dns.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.dns.outputs.GetKeysKeySigningKey;
import io.pulumi.gcp.dns.outputs.GetKeysZoneSigningKey;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetKeysResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * A list of Key-signing key (KSK) records. Structure is documented below. Additionally, the DS record is provided:
     * 
     */
    private final List<GetKeysKeySigningKey> keySigningKeys;
    private final String managedZone;
    private final String project;
    /**
     * A list of Zone-signing key (ZSK) records. Structure is documented below.
     * 
     */
    private final List<GetKeysZoneSigningKey> zoneSigningKeys;

    @CustomType.Constructor
    private GetKeysResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("keySigningKeys") List<GetKeysKeySigningKey> keySigningKeys,
        @CustomType.Parameter("managedZone") String managedZone,
        @CustomType.Parameter("project") String project,
        @CustomType.Parameter("zoneSigningKeys") List<GetKeysZoneSigningKey> zoneSigningKeys) {
        this.id = id;
        this.keySigningKeys = keySigningKeys;
        this.managedZone = managedZone;
        this.project = project;
        this.zoneSigningKeys = zoneSigningKeys;
    }

    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * A list of Key-signing key (KSK) records. Structure is documented below. Additionally, the DS record is provided:
     * 
    */
    public List<GetKeysKeySigningKey> getKeySigningKeys() {
        return this.keySigningKeys;
    }
    public String getManagedZone() {
        return this.managedZone;
    }
    public String getProject() {
        return this.project;
    }
    /**
     * A list of Zone-signing key (ZSK) records. Structure is documented below.
     * 
    */
    public List<GetKeysZoneSigningKey> getZoneSigningKeys() {
        return this.zoneSigningKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<GetKeysKeySigningKey> keySigningKeys;
        private String managedZone;
        private String project;
        private List<GetKeysZoneSigningKey> zoneSigningKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.keySigningKeys = defaults.keySigningKeys;
    	      this.managedZone = defaults.managedZone;
    	      this.project = defaults.project;
    	      this.zoneSigningKeys = defaults.zoneSigningKeys;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder keySigningKeys(List<GetKeysKeySigningKey> keySigningKeys) {
            this.keySigningKeys = Objects.requireNonNull(keySigningKeys);
            return this;
        }

        public Builder managedZone(String managedZone) {
            this.managedZone = Objects.requireNonNull(managedZone);
            return this;
        }

        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder zoneSigningKeys(List<GetKeysZoneSigningKey> zoneSigningKeys) {
            this.zoneSigningKeys = Objects.requireNonNull(zoneSigningKeys);
            return this;
        }
        public GetKeysResult build() {
            return new GetKeysResult(id, keySigningKeys, managedZone, project, zoneSigningKeys);
        }
    }
}
