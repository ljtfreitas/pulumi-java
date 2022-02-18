// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Details of the data collection options specified.
 * 
 */
public final class ACIServiceCreateRequestDataCollectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ACIServiceCreateRequestDataCollectionArgs Empty = new ACIServiceCreateRequestDataCollectionArgs();

    /**
     * Option for enabling/disabling Event Hub.
     * 
     */
    @InputImport(name="eventHubEnabled")
    private final @Nullable Input<Boolean> eventHubEnabled;

    public Input<Boolean> getEventHubEnabled() {
        return this.eventHubEnabled == null ? Input.empty() : this.eventHubEnabled;
    }

    /**
     * Option for enabling/disabling storage.
     * 
     */
    @InputImport(name="storageEnabled")
    private final @Nullable Input<Boolean> storageEnabled;

    public Input<Boolean> getStorageEnabled() {
        return this.storageEnabled == null ? Input.empty() : this.storageEnabled;
    }

    public ACIServiceCreateRequestDataCollectionArgs(
        @Nullable Input<Boolean> eventHubEnabled,
        @Nullable Input<Boolean> storageEnabled) {
        this.eventHubEnabled = eventHubEnabled;
        this.storageEnabled = storageEnabled;
    }

    private ACIServiceCreateRequestDataCollectionArgs() {
        this.eventHubEnabled = Input.empty();
        this.storageEnabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ACIServiceCreateRequestDataCollectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> eventHubEnabled;
        private @Nullable Input<Boolean> storageEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ACIServiceCreateRequestDataCollectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventHubEnabled = defaults.eventHubEnabled;
    	      this.storageEnabled = defaults.storageEnabled;
        }

        public Builder setEventHubEnabled(@Nullable Input<Boolean> eventHubEnabled) {
            this.eventHubEnabled = eventHubEnabled;
            return this;
        }

        public Builder setEventHubEnabled(@Nullable Boolean eventHubEnabled) {
            this.eventHubEnabled = Input.ofNullable(eventHubEnabled);
            return this;
        }

        public Builder setStorageEnabled(@Nullable Input<Boolean> storageEnabled) {
            this.storageEnabled = storageEnabled;
            return this;
        }

        public Builder setStorageEnabled(@Nullable Boolean storageEnabled) {
            this.storageEnabled = Input.ofNullable(storageEnabled);
            return this;
        }

        public ACIServiceCreateRequestDataCollectionArgs build() {
            return new ACIServiceCreateRequestDataCollectionArgs(eventHubEnabled, storageEnabled);
        }
    }
}
