// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.essentialcontacts;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ContactArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContactArgs Empty = new ContactArgs();

    /**
     * The email address to send notifications to. This does not need to be a Google account.
     * 
     */
    @InputImport(name="email", required=true)
        private final Input<String> email;

    public Input<String> getEmail() {
        return this.email;
    }

    /**
     * The preferred language for notifications, as a ISO 639-1 language code. See Supported languages for a list of supported languages.
     * 
     */
    @InputImport(name="languageTag", required=true)
        private final Input<String> languageTag;

    public Input<String> getLanguageTag() {
        return this.languageTag;
    }

    /**
     * The categories of notifications that the contact will receive communications for.
     * 
     */
    @InputImport(name="notificationCategorySubscriptions", required=true)
        private final Input<List<String>> notificationCategorySubscriptions;

    public Input<List<String>> getNotificationCategorySubscriptions() {
        return this.notificationCategorySubscriptions;
    }

    /**
     * The resource to save this contact for. Format: organizations/{organization_id}, folders/{folder_id} or projects/{project_id}
     * 
     */
    @InputImport(name="parent", required=true)
        private final Input<String> parent;

    public Input<String> getParent() {
        return this.parent;
    }

    public ContactArgs(
        Input<String> email,
        Input<String> languageTag,
        Input<List<String>> notificationCategorySubscriptions,
        Input<String> parent) {
        this.email = Objects.requireNonNull(email, "expected parameter 'email' to be non-null");
        this.languageTag = Objects.requireNonNull(languageTag, "expected parameter 'languageTag' to be non-null");
        this.notificationCategorySubscriptions = Objects.requireNonNull(notificationCategorySubscriptions, "expected parameter 'notificationCategorySubscriptions' to be non-null");
        this.parent = Objects.requireNonNull(parent, "expected parameter 'parent' to be non-null");
    }

    private ContactArgs() {
        this.email = Input.empty();
        this.languageTag = Input.empty();
        this.notificationCategorySubscriptions = Input.empty();
        this.parent = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> email;
        private Input<String> languageTag;
        private Input<List<String>> notificationCategorySubscriptions;
        private Input<String> parent;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.languageTag = defaults.languageTag;
    	      this.notificationCategorySubscriptions = defaults.notificationCategorySubscriptions;
    	      this.parent = defaults.parent;
        }

        public Builder setEmail(Input<String> email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }

        public Builder setEmail(String email) {
            this.email = Input.of(Objects.requireNonNull(email));
            return this;
        }

        public Builder setLanguageTag(Input<String> languageTag) {
            this.languageTag = Objects.requireNonNull(languageTag);
            return this;
        }

        public Builder setLanguageTag(String languageTag) {
            this.languageTag = Input.of(Objects.requireNonNull(languageTag));
            return this;
        }

        public Builder setNotificationCategorySubscriptions(Input<List<String>> notificationCategorySubscriptions) {
            this.notificationCategorySubscriptions = Objects.requireNonNull(notificationCategorySubscriptions);
            return this;
        }

        public Builder setNotificationCategorySubscriptions(List<String> notificationCategorySubscriptions) {
            this.notificationCategorySubscriptions = Input.of(Objects.requireNonNull(notificationCategorySubscriptions));
            return this;
        }

        public Builder setParent(Input<String> parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }

        public Builder setParent(String parent) {
            this.parent = Input.of(Objects.requireNonNull(parent));
            return this;
        }
        public ContactArgs build() {
            return new ContactArgs(email, languageTag, notificationCategorySubscriptions, parent);
        }
    }
}
