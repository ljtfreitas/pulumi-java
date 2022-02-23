// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.azurenative.databox.inputs.NotificationPreferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contact Details.
 * 
 */
public final class ContactDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContactDetailsArgs Empty = new ContactDetailsArgs();

    /**
     * Contact name of the person.
     * 
     */
    @InputImport(name="contactName", required=true)
        private final Input<String> contactName;

    public Input<String> getContactName() {
        return this.contactName;
    }

    /**
     * List of Email-ids to be notified about job progress.
     * 
     */
    @InputImport(name="emailList", required=true)
        private final Input<List<String>> emailList;

    public Input<List<String>> getEmailList() {
        return this.emailList;
    }

    /**
     * Mobile number of the contact person.
     * 
     */
    @InputImport(name="mobile")
        private final @Nullable Input<String> mobile;

    public Input<String> getMobile() {
        return this.mobile == null ? Input.empty() : this.mobile;
    }

    /**
     * Notification preference for a job stage.
     * 
     */
    @InputImport(name="notificationPreference")
        private final @Nullable Input<List<NotificationPreferenceArgs>> notificationPreference;

    public Input<List<NotificationPreferenceArgs>> getNotificationPreference() {
        return this.notificationPreference == null ? Input.empty() : this.notificationPreference;
    }

    /**
     * Phone number of the contact person.
     * 
     */
    @InputImport(name="phone", required=true)
        private final Input<String> phone;

    public Input<String> getPhone() {
        return this.phone;
    }

    /**
     * Phone extension number of the contact person.
     * 
     */
    @InputImport(name="phoneExtension")
        private final @Nullable Input<String> phoneExtension;

    public Input<String> getPhoneExtension() {
        return this.phoneExtension == null ? Input.empty() : this.phoneExtension;
    }

    public ContactDetailsArgs(
        Input<String> contactName,
        Input<List<String>> emailList,
        @Nullable Input<String> mobile,
        @Nullable Input<List<NotificationPreferenceArgs>> notificationPreference,
        Input<String> phone,
        @Nullable Input<String> phoneExtension) {
        this.contactName = Objects.requireNonNull(contactName, "expected parameter 'contactName' to be non-null");
        this.emailList = Objects.requireNonNull(emailList, "expected parameter 'emailList' to be non-null");
        this.mobile = mobile;
        this.notificationPreference = notificationPreference;
        this.phone = Objects.requireNonNull(phone, "expected parameter 'phone' to be non-null");
        this.phoneExtension = phoneExtension;
    }

    private ContactDetailsArgs() {
        this.contactName = Input.empty();
        this.emailList = Input.empty();
        this.mobile = Input.empty();
        this.notificationPreference = Input.empty();
        this.phone = Input.empty();
        this.phoneExtension = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> contactName;
        private Input<List<String>> emailList;
        private @Nullable Input<String> mobile;
        private @Nullable Input<List<NotificationPreferenceArgs>> notificationPreference;
        private Input<String> phone;
        private @Nullable Input<String> phoneExtension;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactName = defaults.contactName;
    	      this.emailList = defaults.emailList;
    	      this.mobile = defaults.mobile;
    	      this.notificationPreference = defaults.notificationPreference;
    	      this.phone = defaults.phone;
    	      this.phoneExtension = defaults.phoneExtension;
        }

        public Builder setContactName(Input<String> contactName) {
            this.contactName = Objects.requireNonNull(contactName);
            return this;
        }

        public Builder setContactName(String contactName) {
            this.contactName = Input.of(Objects.requireNonNull(contactName));
            return this;
        }

        public Builder setEmailList(Input<List<String>> emailList) {
            this.emailList = Objects.requireNonNull(emailList);
            return this;
        }

        public Builder setEmailList(List<String> emailList) {
            this.emailList = Input.of(Objects.requireNonNull(emailList));
            return this;
        }

        public Builder setMobile(@Nullable Input<String> mobile) {
            this.mobile = mobile;
            return this;
        }

        public Builder setMobile(@Nullable String mobile) {
            this.mobile = Input.ofNullable(mobile);
            return this;
        }

        public Builder setNotificationPreference(@Nullable Input<List<NotificationPreferenceArgs>> notificationPreference) {
            this.notificationPreference = notificationPreference;
            return this;
        }

        public Builder setNotificationPreference(@Nullable List<NotificationPreferenceArgs> notificationPreference) {
            this.notificationPreference = Input.ofNullable(notificationPreference);
            return this;
        }

        public Builder setPhone(Input<String> phone) {
            this.phone = Objects.requireNonNull(phone);
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = Input.of(Objects.requireNonNull(phone));
            return this;
        }

        public Builder setPhoneExtension(@Nullable Input<String> phoneExtension) {
            this.phoneExtension = phoneExtension;
            return this;
        }

        public Builder setPhoneExtension(@Nullable String phoneExtension) {
            this.phoneExtension = Input.ofNullable(phoneExtension);
            return this;
        }
        public ContactDetailsArgs build() {
            return new ContactDetailsArgs(contactName, emailList, mobile, notificationPreference, phone, phoneExtension);
        }
    }
}
