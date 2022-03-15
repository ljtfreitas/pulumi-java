// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.outputs;

import io.pulumi.awsnative.mediapackage.enums.OriginEndpointAdsOnDeliveryRestrictions;
import io.pulumi.awsnative.mediapackage.enums.OriginEndpointHlsManifestAdMarkers;
import io.pulumi.awsnative.mediapackage.enums.OriginEndpointHlsManifestAdTriggersItem;
import io.pulumi.awsnative.mediapackage.enums.OriginEndpointHlsManifestPlaylistType;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OriginEndpointHlsManifest {
    /**
     * This setting controls how ad markers are included in the packaged OriginEndpoint. "NONE" will omit all SCTE-35 ad markers from the output. "PASSTHROUGH" causes the manifest to contain a copy of the SCTE-35 ad markers (comments) taken directly from the input HTTP Live Streaming (HLS) manifest. "SCTE35_ENHANCED" generates ad markers and blackout tags based on SCTE-35 messages in the input source. "DATERANGE" inserts EXT-X-DATERANGE tags to signal ad and program transition events in HLS and CMAF manifests. For this option, you must set a programDateTimeIntervalSeconds value that is greater than 0.
     * 
     */
    private final @Nullable OriginEndpointHlsManifestAdMarkers adMarkers;
    /**
     * A list of SCTE-35 message types that are treated as ad markers in the output.  If empty, no ad markers are output.  Specify multiple items to create ad markers for all of the included message types.
     * 
     */
    private final @Nullable List<OriginEndpointHlsManifestAdTriggersItem> adTriggers;
    private final @Nullable OriginEndpointAdsOnDeliveryRestrictions adsOnDeliveryRestrictions;
    /**
     * The ID of the manifest. The ID must be unique within the OriginEndpoint and it cannot be changed after it is created.
     * 
     */
    private final String id;
    /**
     * When enabled, an I-Frame only stream will be included in the output.
     * 
     */
    private final @Nullable Boolean includeIframeOnlyStream;
    /**
     * An optional short string appended to the end of the OriginEndpoint URL. If not specified, defaults to the manifestName for the OriginEndpoint.
     * 
     */
    private final @Nullable String manifestName;
    /**
     * The HTTP Live Streaming (HLS) playlist type. When either "EVENT" or "VOD" is specified, a corresponding EXT-X-PLAYLIST-TYPE entry will be included in the media playlist.
     * 
     */
    private final @Nullable OriginEndpointHlsManifestPlaylistType playlistType;
    /**
     * Time window (in seconds) contained in each parent manifest.
     * 
     */
    private final @Nullable Integer playlistWindowSeconds;
    /**
     * The interval (in seconds) between each EXT-X-PROGRAM-DATE-TIME tag inserted into manifests. Additionally, when an interval is specified ID3Timed Metadata messages will be generated every 5 seconds using the ingest time of the content. If the interval is not specified, or set to 0, then no EXT-X-PROGRAM-DATE-TIME tags will be inserted into manifests and no ID3Timed Metadata messages will be generated. Note that irrespective of this parameter, if any ID3 Timed Metadata is found in HTTP Live Streaming (HLS) input, it will be passed through to HLS output.
     * 
     */
    private final @Nullable Integer programDateTimeIntervalSeconds;
    /**
     * The URL of the packaged OriginEndpoint for consumption.
     * 
     */
    private final @Nullable String url;

    @CustomType.Constructor
    private OriginEndpointHlsManifest(
        @CustomType.Parameter("adMarkers") @Nullable OriginEndpointHlsManifestAdMarkers adMarkers,
        @CustomType.Parameter("adTriggers") @Nullable List<OriginEndpointHlsManifestAdTriggersItem> adTriggers,
        @CustomType.Parameter("adsOnDeliveryRestrictions") @Nullable OriginEndpointAdsOnDeliveryRestrictions adsOnDeliveryRestrictions,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("includeIframeOnlyStream") @Nullable Boolean includeIframeOnlyStream,
        @CustomType.Parameter("manifestName") @Nullable String manifestName,
        @CustomType.Parameter("playlistType") @Nullable OriginEndpointHlsManifestPlaylistType playlistType,
        @CustomType.Parameter("playlistWindowSeconds") @Nullable Integer playlistWindowSeconds,
        @CustomType.Parameter("programDateTimeIntervalSeconds") @Nullable Integer programDateTimeIntervalSeconds,
        @CustomType.Parameter("url") @Nullable String url) {
        this.adMarkers = adMarkers;
        this.adTriggers = adTriggers;
        this.adsOnDeliveryRestrictions = adsOnDeliveryRestrictions;
        this.id = id;
        this.includeIframeOnlyStream = includeIframeOnlyStream;
        this.manifestName = manifestName;
        this.playlistType = playlistType;
        this.playlistWindowSeconds = playlistWindowSeconds;
        this.programDateTimeIntervalSeconds = programDateTimeIntervalSeconds;
        this.url = url;
    }

    /**
     * This setting controls how ad markers are included in the packaged OriginEndpoint. "NONE" will omit all SCTE-35 ad markers from the output. "PASSTHROUGH" causes the manifest to contain a copy of the SCTE-35 ad markers (comments) taken directly from the input HTTP Live Streaming (HLS) manifest. "SCTE35_ENHANCED" generates ad markers and blackout tags based on SCTE-35 messages in the input source. "DATERANGE" inserts EXT-X-DATERANGE tags to signal ad and program transition events in HLS and CMAF manifests. For this option, you must set a programDateTimeIntervalSeconds value that is greater than 0.
     * 
    */
    public Optional<OriginEndpointHlsManifestAdMarkers> getAdMarkers() {
        return Optional.ofNullable(this.adMarkers);
    }
    /**
     * A list of SCTE-35 message types that are treated as ad markers in the output.  If empty, no ad markers are output.  Specify multiple items to create ad markers for all of the included message types.
     * 
    */
    public List<OriginEndpointHlsManifestAdTriggersItem> getAdTriggers() {
        return this.adTriggers == null ? List.of() : this.adTriggers;
    }
    public Optional<OriginEndpointAdsOnDeliveryRestrictions> getAdsOnDeliveryRestrictions() {
        return Optional.ofNullable(this.adsOnDeliveryRestrictions);
    }
    /**
     * The ID of the manifest. The ID must be unique within the OriginEndpoint and it cannot be changed after it is created.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * When enabled, an I-Frame only stream will be included in the output.
     * 
    */
    public Optional<Boolean> getIncludeIframeOnlyStream() {
        return Optional.ofNullable(this.includeIframeOnlyStream);
    }
    /**
     * An optional short string appended to the end of the OriginEndpoint URL. If not specified, defaults to the manifestName for the OriginEndpoint.
     * 
    */
    public Optional<String> getManifestName() {
        return Optional.ofNullable(this.manifestName);
    }
    /**
     * The HTTP Live Streaming (HLS) playlist type. When either "EVENT" or "VOD" is specified, a corresponding EXT-X-PLAYLIST-TYPE entry will be included in the media playlist.
     * 
    */
    public Optional<OriginEndpointHlsManifestPlaylistType> getPlaylistType() {
        return Optional.ofNullable(this.playlistType);
    }
    /**
     * Time window (in seconds) contained in each parent manifest.
     * 
    */
    public Optional<Integer> getPlaylistWindowSeconds() {
        return Optional.ofNullable(this.playlistWindowSeconds);
    }
    /**
     * The interval (in seconds) between each EXT-X-PROGRAM-DATE-TIME tag inserted into manifests. Additionally, when an interval is specified ID3Timed Metadata messages will be generated every 5 seconds using the ingest time of the content. If the interval is not specified, or set to 0, then no EXT-X-PROGRAM-DATE-TIME tags will be inserted into manifests and no ID3Timed Metadata messages will be generated. Note that irrespective of this parameter, if any ID3 Timed Metadata is found in HTTP Live Streaming (HLS) input, it will be passed through to HLS output.
     * 
    */
    public Optional<Integer> getProgramDateTimeIntervalSeconds() {
        return Optional.ofNullable(this.programDateTimeIntervalSeconds);
    }
    /**
     * The URL of the packaged OriginEndpoint for consumption.
     * 
    */
    public Optional<String> getUrl() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginEndpointHlsManifest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable OriginEndpointHlsManifestAdMarkers adMarkers;
        private @Nullable List<OriginEndpointHlsManifestAdTriggersItem> adTriggers;
        private @Nullable OriginEndpointAdsOnDeliveryRestrictions adsOnDeliveryRestrictions;
        private String id;
        private @Nullable Boolean includeIframeOnlyStream;
        private @Nullable String manifestName;
        private @Nullable OriginEndpointHlsManifestPlaylistType playlistType;
        private @Nullable Integer playlistWindowSeconds;
        private @Nullable Integer programDateTimeIntervalSeconds;
        private @Nullable String url;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginEndpointHlsManifest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adMarkers = defaults.adMarkers;
    	      this.adTriggers = defaults.adTriggers;
    	      this.adsOnDeliveryRestrictions = defaults.adsOnDeliveryRestrictions;
    	      this.id = defaults.id;
    	      this.includeIframeOnlyStream = defaults.includeIframeOnlyStream;
    	      this.manifestName = defaults.manifestName;
    	      this.playlistType = defaults.playlistType;
    	      this.playlistWindowSeconds = defaults.playlistWindowSeconds;
    	      this.programDateTimeIntervalSeconds = defaults.programDateTimeIntervalSeconds;
    	      this.url = defaults.url;
        }

        public Builder adMarkers(@Nullable OriginEndpointHlsManifestAdMarkers adMarkers) {
            this.adMarkers = adMarkers;
            return this;
        }

        public Builder adTriggers(@Nullable List<OriginEndpointHlsManifestAdTriggersItem> adTriggers) {
            this.adTriggers = adTriggers;
            return this;
        }

        public Builder adsOnDeliveryRestrictions(@Nullable OriginEndpointAdsOnDeliveryRestrictions adsOnDeliveryRestrictions) {
            this.adsOnDeliveryRestrictions = adsOnDeliveryRestrictions;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder includeIframeOnlyStream(@Nullable Boolean includeIframeOnlyStream) {
            this.includeIframeOnlyStream = includeIframeOnlyStream;
            return this;
        }

        public Builder manifestName(@Nullable String manifestName) {
            this.manifestName = manifestName;
            return this;
        }

        public Builder playlistType(@Nullable OriginEndpointHlsManifestPlaylistType playlistType) {
            this.playlistType = playlistType;
            return this;
        }

        public Builder playlistWindowSeconds(@Nullable Integer playlistWindowSeconds) {
            this.playlistWindowSeconds = playlistWindowSeconds;
            return this;
        }

        public Builder programDateTimeIntervalSeconds(@Nullable Integer programDateTimeIntervalSeconds) {
            this.programDateTimeIntervalSeconds = programDateTimeIntervalSeconds;
            return this;
        }

        public Builder url(@Nullable String url) {
            this.url = url;
            return this;
        }
        public OriginEndpointHlsManifest build() {
            return new OriginEndpointHlsManifest(adMarkers, adTriggers, adsOnDeliveryRestrictions, id, includeIframeOnlyStream, manifestName, playlistType, playlistWindowSeconds, programDateTimeIntervalSeconds, url);
        }
    }
}
