// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.azurenative.databox.inputs.EncryptionPreferencesArgs;
import io.pulumi.azurenative.databox.inputs.TransportPreferencesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Preferences related to the order
 * 
 */
public final class PreferencesArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreferencesArgs Empty = new PreferencesArgs();

    /**
     * Preferences related to the Encryption.
     * 
     */
    @InputImport(name="encryptionPreferences")
    private final @Nullable Input<EncryptionPreferencesArgs> encryptionPreferences;

    public Input<EncryptionPreferencesArgs> getEncryptionPreferences() {
        return this.encryptionPreferences == null ? Input.empty() : this.encryptionPreferences;
    }

    /**
     * Preferred data center region.
     * 
     */
    @InputImport(name="preferredDataCenterRegion")
    private final @Nullable Input<List<String>> preferredDataCenterRegion;

    public Input<List<String>> getPreferredDataCenterRegion() {
        return this.preferredDataCenterRegion == null ? Input.empty() : this.preferredDataCenterRegion;
    }

    /**
     * Preferences related to the shipment logistics of the sku.
     * 
     */
    @InputImport(name="transportPreferences")
    private final @Nullable Input<TransportPreferencesArgs> transportPreferences;

    public Input<TransportPreferencesArgs> getTransportPreferences() {
        return this.transportPreferences == null ? Input.empty() : this.transportPreferences;
    }

    public PreferencesArgs(
        @Nullable Input<EncryptionPreferencesArgs> encryptionPreferences,
        @Nullable Input<List<String>> preferredDataCenterRegion,
        @Nullable Input<TransportPreferencesArgs> transportPreferences) {
        this.encryptionPreferences = encryptionPreferences;
        this.preferredDataCenterRegion = preferredDataCenterRegion;
        this.transportPreferences = transportPreferences;
    }

    private PreferencesArgs() {
        this.encryptionPreferences = Input.empty();
        this.preferredDataCenterRegion = Input.empty();
        this.transportPreferences = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreferencesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<EncryptionPreferencesArgs> encryptionPreferences;
        private @Nullable Input<List<String>> preferredDataCenterRegion;
        private @Nullable Input<TransportPreferencesArgs> transportPreferences;

        public Builder() {
    	      // Empty
        }

        public Builder(PreferencesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionPreferences = defaults.encryptionPreferences;
    	      this.preferredDataCenterRegion = defaults.preferredDataCenterRegion;
    	      this.transportPreferences = defaults.transportPreferences;
        }

        public Builder setEncryptionPreferences(@Nullable Input<EncryptionPreferencesArgs> encryptionPreferences) {
            this.encryptionPreferences = encryptionPreferences;
            return this;
        }

        public Builder setEncryptionPreferences(@Nullable EncryptionPreferencesArgs encryptionPreferences) {
            this.encryptionPreferences = Input.ofNullable(encryptionPreferences);
            return this;
        }

        public Builder setPreferredDataCenterRegion(@Nullable Input<List<String>> preferredDataCenterRegion) {
            this.preferredDataCenterRegion = preferredDataCenterRegion;
            return this;
        }

        public Builder setPreferredDataCenterRegion(@Nullable List<String> preferredDataCenterRegion) {
            this.preferredDataCenterRegion = Input.ofNullable(preferredDataCenterRegion);
            return this;
        }

        public Builder setTransportPreferences(@Nullable Input<TransportPreferencesArgs> transportPreferences) {
            this.transportPreferences = transportPreferences;
            return this;
        }

        public Builder setTransportPreferences(@Nullable TransportPreferencesArgs transportPreferences) {
            this.transportPreferences = Input.ofNullable(transportPreferences);
            return this;
        }

        public PreferencesArgs build() {
            return new PreferencesArgs(encryptionPreferences, preferredDataCenterRegion, transportPreferences);
        }
    }
}
