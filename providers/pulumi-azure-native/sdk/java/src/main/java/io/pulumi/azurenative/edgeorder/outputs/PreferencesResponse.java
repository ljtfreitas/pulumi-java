// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.outputs;

import io.pulumi.azurenative.edgeorder.outputs.EncryptionPreferencesResponse;
import io.pulumi.azurenative.edgeorder.outputs.ManagementResourcePreferencesResponse;
import io.pulumi.azurenative.edgeorder.outputs.NotificationPreferenceResponse;
import io.pulumi.azurenative.edgeorder.outputs.TransportPreferencesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PreferencesResponse {
    /**
     * Preferences related to the Encryption.
     * 
     */
    private final @Nullable EncryptionPreferencesResponse encryptionPreferences;
    /**
     * Preferences related to the Management resource.
     * 
     */
    private final @Nullable ManagementResourcePreferencesResponse managementResourcePreferences;
    /**
     * Notification preferences.
     * 
     */
    private final @Nullable List<NotificationPreferenceResponse> notificationPreferences;
    /**
     * Preferences related to the shipment logistics of the order.
     * 
     */
    private final @Nullable TransportPreferencesResponse transportPreferences;

    @OutputCustomType.Constructor({"encryptionPreferences","managementResourcePreferences","notificationPreferences","transportPreferences"})
    private PreferencesResponse(
        @Nullable EncryptionPreferencesResponse encryptionPreferences,
        @Nullable ManagementResourcePreferencesResponse managementResourcePreferences,
        @Nullable List<NotificationPreferenceResponse> notificationPreferences,
        @Nullable TransportPreferencesResponse transportPreferences) {
        this.encryptionPreferences = encryptionPreferences;
        this.managementResourcePreferences = managementResourcePreferences;
        this.notificationPreferences = notificationPreferences;
        this.transportPreferences = transportPreferences;
    }

    /**
     * Preferences related to the Encryption.
     * 
     */
    public Optional<EncryptionPreferencesResponse> getEncryptionPreferences() {
        return Optional.ofNullable(this.encryptionPreferences);
    }
    /**
     * Preferences related to the Management resource.
     * 
     */
    public Optional<ManagementResourcePreferencesResponse> getManagementResourcePreferences() {
        return Optional.ofNullable(this.managementResourcePreferences);
    }
    /**
     * Notification preferences.
     * 
     */
    public List<NotificationPreferenceResponse> getNotificationPreferences() {
        return this.notificationPreferences == null ? List.of() : this.notificationPreferences;
    }
    /**
     * Preferences related to the shipment logistics of the order.
     * 
     */
    public Optional<TransportPreferencesResponse> getTransportPreferences() {
        return Optional.ofNullable(this.transportPreferences);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreferencesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EncryptionPreferencesResponse encryptionPreferences;
        private @Nullable ManagementResourcePreferencesResponse managementResourcePreferences;
        private @Nullable List<NotificationPreferenceResponse> notificationPreferences;
        private @Nullable TransportPreferencesResponse transportPreferences;

        public Builder() {
    	      // Empty
        }

        public Builder(PreferencesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionPreferences = defaults.encryptionPreferences;
    	      this.managementResourcePreferences = defaults.managementResourcePreferences;
    	      this.notificationPreferences = defaults.notificationPreferences;
    	      this.transportPreferences = defaults.transportPreferences;
        }

        public Builder setEncryptionPreferences(@Nullable EncryptionPreferencesResponse encryptionPreferences) {
            this.encryptionPreferences = encryptionPreferences;
            return this;
        }

        public Builder setManagementResourcePreferences(@Nullable ManagementResourcePreferencesResponse managementResourcePreferences) {
            this.managementResourcePreferences = managementResourcePreferences;
            return this;
        }

        public Builder setNotificationPreferences(@Nullable List<NotificationPreferenceResponse> notificationPreferences) {
            this.notificationPreferences = notificationPreferences;
            return this;
        }

        public Builder setTransportPreferences(@Nullable TransportPreferencesResponse transportPreferences) {
            this.transportPreferences = transportPreferences;
            return this;
        }
        public PreferencesResponse build() {
            return new PreferencesResponse(encryptionPreferences, managementResourcePreferences, notificationPreferences, transportPreferences);
        }
    }
}
