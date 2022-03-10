// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.outputs;

import io.pulumi.awsnative.mediapackage.enums.OriginEndpointAdsOnDeliveryRestrictions;
import io.pulumi.awsnative.mediapackage.enums.OriginEndpointHlsPackageAdMarkers;
import io.pulumi.awsnative.mediapackage.enums.OriginEndpointHlsPackageAdTriggersItem;
import io.pulumi.awsnative.mediapackage.enums.OriginEndpointHlsPackagePlaylistType;
import io.pulumi.awsnative.mediapackage.outputs.OriginEndpointHlsEncryption;
import io.pulumi.awsnative.mediapackage.outputs.OriginEndpointStreamSelection;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OriginEndpointHlsPackage {
    /**
     * This setting controls how ad markers are included in the packaged OriginEndpoint. "NONE" will omit all SCTE-35 ad markers from the output. "PASSTHROUGH" causes the manifest to contain a copy of the SCTE-35 ad markers (comments) taken directly from the input HTTP Live Streaming (HLS) manifest. "SCTE35_ENHANCED" generates ad markers and blackout tags based on SCTE-35 messages in the input source. "DATERANGE" inserts EXT-X-DATERANGE tags to signal ad and program transition events in HLS and CMAF manifests. For this option, you must set a programDateTimeIntervalSeconds value that is greater than 0.
     * 
     */
    private final @Nullable OriginEndpointHlsPackageAdMarkers adMarkers;
    /**
     * A list of SCTE-35 message types that are treated as ad markers in the output.  If empty, no ad markers are output.  Specify multiple items to create ad markers for all of the included message types.
     * 
     */
    private final @Nullable List<OriginEndpointHlsPackageAdTriggersItem> adTriggers;
    private final @Nullable OriginEndpointAdsOnDeliveryRestrictions adsOnDeliveryRestrictions;
    private final @Nullable OriginEndpointHlsEncryption encryption;
    /**
     * When enabled, an I-Frame only stream will be included in the output.
     * 
     */
    private final @Nullable Boolean includeIframeOnlyStream;
    /**
     * The HTTP Live Streaming (HLS) playlist type. When either "EVENT" or "VOD" is specified, a corresponding EXT-X-PLAYLIST-TYPE entry will be included in the media playlist.
     * 
     */
    private final @Nullable OriginEndpointHlsPackagePlaylistType playlistType;
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
     * Duration (in seconds) of each fragment. Actual fragments will be rounded to the nearest multiple of the source fragment duration.
     * 
     */
    private final @Nullable Integer segmentDurationSeconds;
    private final @Nullable OriginEndpointStreamSelection streamSelection;
    /**
     * When enabled, audio streams will be placed in rendition groups in the output.
     * 
     */
    private final @Nullable Boolean useAudioRenditionGroup;

    @OutputCustomType.Constructor
    private OriginEndpointHlsPackage(
        @OutputCustomType.Parameter("adMarkers") @Nullable OriginEndpointHlsPackageAdMarkers adMarkers,
        @OutputCustomType.Parameter("adTriggers") @Nullable List<OriginEndpointHlsPackageAdTriggersItem> adTriggers,
        @OutputCustomType.Parameter("adsOnDeliveryRestrictions") @Nullable OriginEndpointAdsOnDeliveryRestrictions adsOnDeliveryRestrictions,
        @OutputCustomType.Parameter("encryption") @Nullable OriginEndpointHlsEncryption encryption,
        @OutputCustomType.Parameter("includeIframeOnlyStream") @Nullable Boolean includeIframeOnlyStream,
        @OutputCustomType.Parameter("playlistType") @Nullable OriginEndpointHlsPackagePlaylistType playlistType,
        @OutputCustomType.Parameter("playlistWindowSeconds") @Nullable Integer playlistWindowSeconds,
        @OutputCustomType.Parameter("programDateTimeIntervalSeconds") @Nullable Integer programDateTimeIntervalSeconds,
        @OutputCustomType.Parameter("segmentDurationSeconds") @Nullable Integer segmentDurationSeconds,
        @OutputCustomType.Parameter("streamSelection") @Nullable OriginEndpointStreamSelection streamSelection,
        @OutputCustomType.Parameter("useAudioRenditionGroup") @Nullable Boolean useAudioRenditionGroup) {
        this.adMarkers = adMarkers;
        this.adTriggers = adTriggers;
        this.adsOnDeliveryRestrictions = adsOnDeliveryRestrictions;
        this.encryption = encryption;
        this.includeIframeOnlyStream = includeIframeOnlyStream;
        this.playlistType = playlistType;
        this.playlistWindowSeconds = playlistWindowSeconds;
        this.programDateTimeIntervalSeconds = programDateTimeIntervalSeconds;
        this.segmentDurationSeconds = segmentDurationSeconds;
        this.streamSelection = streamSelection;
        this.useAudioRenditionGroup = useAudioRenditionGroup;
    }

    /**
     * This setting controls how ad markers are included in the packaged OriginEndpoint. "NONE" will omit all SCTE-35 ad markers from the output. "PASSTHROUGH" causes the manifest to contain a copy of the SCTE-35 ad markers (comments) taken directly from the input HTTP Live Streaming (HLS) manifest. "SCTE35_ENHANCED" generates ad markers and blackout tags based on SCTE-35 messages in the input source. "DATERANGE" inserts EXT-X-DATERANGE tags to signal ad and program transition events in HLS and CMAF manifests. For this option, you must set a programDateTimeIntervalSeconds value that is greater than 0.
     * 
    */
    public Optional<OriginEndpointHlsPackageAdMarkers> getAdMarkers() {
        return Optional.ofNullable(this.adMarkers);
    }
    /**
     * A list of SCTE-35 message types that are treated as ad markers in the output.  If empty, no ad markers are output.  Specify multiple items to create ad markers for all of the included message types.
     * 
    */
    public List<OriginEndpointHlsPackageAdTriggersItem> getAdTriggers() {
        return this.adTriggers == null ? List.of() : this.adTriggers;
    }
    public Optional<OriginEndpointAdsOnDeliveryRestrictions> getAdsOnDeliveryRestrictions() {
        return Optional.ofNullable(this.adsOnDeliveryRestrictions);
    }
    public Optional<OriginEndpointHlsEncryption> getEncryption() {
        return Optional.ofNullable(this.encryption);
    }
    /**
     * When enabled, an I-Frame only stream will be included in the output.
     * 
    */
    public Optional<Boolean> getIncludeIframeOnlyStream() {
        return Optional.ofNullable(this.includeIframeOnlyStream);
    }
    /**
     * The HTTP Live Streaming (HLS) playlist type. When either "EVENT" or "VOD" is specified, a corresponding EXT-X-PLAYLIST-TYPE entry will be included in the media playlist.
     * 
    */
    public Optional<OriginEndpointHlsPackagePlaylistType> getPlaylistType() {
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
     * Duration (in seconds) of each fragment. Actual fragments will be rounded to the nearest multiple of the source fragment duration.
     * 
    */
    public Optional<Integer> getSegmentDurationSeconds() {
        return Optional.ofNullable(this.segmentDurationSeconds);
    }
    public Optional<OriginEndpointStreamSelection> getStreamSelection() {
        return Optional.ofNullable(this.streamSelection);
    }
    /**
     * When enabled, audio streams will be placed in rendition groups in the output.
     * 
    */
    public Optional<Boolean> getUseAudioRenditionGroup() {
        return Optional.ofNullable(this.useAudioRenditionGroup);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginEndpointHlsPackage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable OriginEndpointHlsPackageAdMarkers adMarkers;
        private @Nullable List<OriginEndpointHlsPackageAdTriggersItem> adTriggers;
        private @Nullable OriginEndpointAdsOnDeliveryRestrictions adsOnDeliveryRestrictions;
        private @Nullable OriginEndpointHlsEncryption encryption;
        private @Nullable Boolean includeIframeOnlyStream;
        private @Nullable OriginEndpointHlsPackagePlaylistType playlistType;
        private @Nullable Integer playlistWindowSeconds;
        private @Nullable Integer programDateTimeIntervalSeconds;
        private @Nullable Integer segmentDurationSeconds;
        private @Nullable OriginEndpointStreamSelection streamSelection;
        private @Nullable Boolean useAudioRenditionGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginEndpointHlsPackage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adMarkers = defaults.adMarkers;
    	      this.adTriggers = defaults.adTriggers;
    	      this.adsOnDeliveryRestrictions = defaults.adsOnDeliveryRestrictions;
    	      this.encryption = defaults.encryption;
    	      this.includeIframeOnlyStream = defaults.includeIframeOnlyStream;
    	      this.playlistType = defaults.playlistType;
    	      this.playlistWindowSeconds = defaults.playlistWindowSeconds;
    	      this.programDateTimeIntervalSeconds = defaults.programDateTimeIntervalSeconds;
    	      this.segmentDurationSeconds = defaults.segmentDurationSeconds;
    	      this.streamSelection = defaults.streamSelection;
    	      this.useAudioRenditionGroup = defaults.useAudioRenditionGroup;
        }

        public Builder setAdMarkers(@Nullable OriginEndpointHlsPackageAdMarkers adMarkers) {
            this.adMarkers = adMarkers;
            return this;
        }

        public Builder setAdTriggers(@Nullable List<OriginEndpointHlsPackageAdTriggersItem> adTriggers) {
            this.adTriggers = adTriggers;
            return this;
        }

        public Builder setAdsOnDeliveryRestrictions(@Nullable OriginEndpointAdsOnDeliveryRestrictions adsOnDeliveryRestrictions) {
            this.adsOnDeliveryRestrictions = adsOnDeliveryRestrictions;
            return this;
        }

        public Builder setEncryption(@Nullable OriginEndpointHlsEncryption encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder setIncludeIframeOnlyStream(@Nullable Boolean includeIframeOnlyStream) {
            this.includeIframeOnlyStream = includeIframeOnlyStream;
            return this;
        }

        public Builder setPlaylistType(@Nullable OriginEndpointHlsPackagePlaylistType playlistType) {
            this.playlistType = playlistType;
            return this;
        }

        public Builder setPlaylistWindowSeconds(@Nullable Integer playlistWindowSeconds) {
            this.playlistWindowSeconds = playlistWindowSeconds;
            return this;
        }

        public Builder setProgramDateTimeIntervalSeconds(@Nullable Integer programDateTimeIntervalSeconds) {
            this.programDateTimeIntervalSeconds = programDateTimeIntervalSeconds;
            return this;
        }

        public Builder setSegmentDurationSeconds(@Nullable Integer segmentDurationSeconds) {
            this.segmentDurationSeconds = segmentDurationSeconds;
            return this;
        }

        public Builder setStreamSelection(@Nullable OriginEndpointStreamSelection streamSelection) {
            this.streamSelection = streamSelection;
            return this;
        }

        public Builder setUseAudioRenditionGroup(@Nullable Boolean useAudioRenditionGroup) {
            this.useAudioRenditionGroup = useAudioRenditionGroup;
            return this;
        }
        public OriginEndpointHlsPackage build() {
            return new OriginEndpointHlsPackage(adMarkers, adTriggers, adsOnDeliveryRestrictions, encryption, includeIframeOnlyStream, playlistType, playlistWindowSeconds, programDateTimeIntervalSeconds, segmentDurationSeconds, streamSelection, useAudioRenditionGroup);
        }
    }
}
