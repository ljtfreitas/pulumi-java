// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetZoneResult {
    /**
     * The etag of the zone.
     * 
     */
    private final @Nullable String etag;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource location.
     * 
     */
    private final String location;
    /**
     * The maximum number of record sets that can be created in this DNS zone.  This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    private final Double maxNumberOfRecordSets;
    /**
     * The maximum number of records per record set that can be created in this DNS zone.  This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    private final Double maxNumberOfRecordsPerRecordSet;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The name servers for this DNS zone. This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    private final List<String> nameServers;
    /**
     * The current number of record sets in this DNS zone.  This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    private final Double numberOfRecordSets;
    /**
     * A list of references to virtual networks that register hostnames in this DNS zone. This is a only when ZoneType is Private.
     * 
     */
    private final @Nullable List<SubResourceResponse> registrationVirtualNetworks;
    /**
     * A list of references to virtual networks that resolve records in this DNS zone. This is a only when ZoneType is Private.
     * 
     */
    private final @Nullable List<SubResourceResponse> resolutionVirtualNetworks;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * The type of this DNS zone (Public or Private).
     * 
     */
    private final @Nullable String zoneType;

    @OutputCustomType.Constructor({"etag","id","location","maxNumberOfRecordSets","maxNumberOfRecordsPerRecordSet","name","nameServers","numberOfRecordSets","registrationVirtualNetworks","resolutionVirtualNetworks","tags","type","zoneType"})
    private GetZoneResult(
        @Nullable String etag,
        String id,
        String location,
        Double maxNumberOfRecordSets,
        Double maxNumberOfRecordsPerRecordSet,
        String name,
        List<String> nameServers,
        Double numberOfRecordSets,
        @Nullable List<SubResourceResponse> registrationVirtualNetworks,
        @Nullable List<SubResourceResponse> resolutionVirtualNetworks,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable String zoneType) {
        this.etag = etag;
        this.id = Objects.requireNonNull(id);
        this.location = Objects.requireNonNull(location);
        this.maxNumberOfRecordSets = Objects.requireNonNull(maxNumberOfRecordSets);
        this.maxNumberOfRecordsPerRecordSet = Objects.requireNonNull(maxNumberOfRecordsPerRecordSet);
        this.name = Objects.requireNonNull(name);
        this.nameServers = Objects.requireNonNull(nameServers);
        this.numberOfRecordSets = Objects.requireNonNull(numberOfRecordSets);
        this.registrationVirtualNetworks = registrationVirtualNetworks;
        this.resolutionVirtualNetworks = resolutionVirtualNetworks;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.zoneType = zoneType;
    }

    /**
     * The etag of the zone.
     * 
     */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * Resource ID.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Resource location.
     * 
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * The maximum number of record sets that can be created in this DNS zone.  This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    public Double getMaxNumberOfRecordSets() {
        return this.maxNumberOfRecordSets;
    }
    /**
     * The maximum number of records per record set that can be created in this DNS zone.  This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    public Double getMaxNumberOfRecordsPerRecordSet() {
        return this.maxNumberOfRecordsPerRecordSet;
    }
    /**
     * Resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The name servers for this DNS zone. This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    public List<String> getNameServers() {
        return this.nameServers;
    }
    /**
     * The current number of record sets in this DNS zone.  This is a read-only property and any attempt to set this value will be ignored.
     * 
     */
    public Double getNumberOfRecordSets() {
        return this.numberOfRecordSets;
    }
    /**
     * A list of references to virtual networks that register hostnames in this DNS zone. This is a only when ZoneType is Private.
     * 
     */
    public List<SubResourceResponse> getRegistrationVirtualNetworks() {
        return this.registrationVirtualNetworks == null ? List.of() : this.registrationVirtualNetworks;
    }
    /**
     * A list of references to virtual networks that resolve records in this DNS zone. This is a only when ZoneType is Private.
     * 
     */
    public List<SubResourceResponse> getResolutionVirtualNetworks() {
        return this.resolutionVirtualNetworks == null ? List.of() : this.resolutionVirtualNetworks;
    }
    /**
     * Resource tags.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * The type of this DNS zone (Public or Private).
     * 
     */
    public Optional<String> getZoneType() {
        return Optional.ofNullable(this.zoneType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZoneResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String etag;
        private String id;
        private String location;
        private Double maxNumberOfRecordSets;
        private Double maxNumberOfRecordsPerRecordSet;
        private String name;
        private List<String> nameServers;
        private Double numberOfRecordSets;
        private @Nullable List<SubResourceResponse> registrationVirtualNetworks;
        private @Nullable List<SubResourceResponse> resolutionVirtualNetworks;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable String zoneType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetZoneResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.maxNumberOfRecordSets = defaults.maxNumberOfRecordSets;
    	      this.maxNumberOfRecordsPerRecordSet = defaults.maxNumberOfRecordsPerRecordSet;
    	      this.name = defaults.name;
    	      this.nameServers = defaults.nameServers;
    	      this.numberOfRecordSets = defaults.numberOfRecordSets;
    	      this.registrationVirtualNetworks = defaults.registrationVirtualNetworks;
    	      this.resolutionVirtualNetworks = defaults.resolutionVirtualNetworks;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.zoneType = defaults.zoneType;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setMaxNumberOfRecordSets(Double maxNumberOfRecordSets) {
            this.maxNumberOfRecordSets = Objects.requireNonNull(maxNumberOfRecordSets);
            return this;
        }

        public Builder setMaxNumberOfRecordsPerRecordSet(Double maxNumberOfRecordsPerRecordSet) {
            this.maxNumberOfRecordsPerRecordSet = Objects.requireNonNull(maxNumberOfRecordsPerRecordSet);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNameServers(List<String> nameServers) {
            this.nameServers = Objects.requireNonNull(nameServers);
            return this;
        }

        public Builder setNumberOfRecordSets(Double numberOfRecordSets) {
            this.numberOfRecordSets = Objects.requireNonNull(numberOfRecordSets);
            return this;
        }

        public Builder setRegistrationVirtualNetworks(@Nullable List<SubResourceResponse> registrationVirtualNetworks) {
            this.registrationVirtualNetworks = registrationVirtualNetworks;
            return this;
        }

        public Builder setResolutionVirtualNetworks(@Nullable List<SubResourceResponse> resolutionVirtualNetworks) {
            this.resolutionVirtualNetworks = resolutionVirtualNetworks;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setZoneType(@Nullable String zoneType) {
            this.zoneType = zoneType;
            return this;
        }

        public GetZoneResult build() {
            return new GetZoneResult(etag, id, location, maxNumberOfRecordSets, maxNumberOfRecordsPerRecordSet, name, nameServers, numberOfRecordSets, registrationVirtualNetworks, resolutionVirtualNetworks, tags, type, zoneType);
        }
    }
}
