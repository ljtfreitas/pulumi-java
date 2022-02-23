// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ses.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetContactListArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetContactListArgs Empty = new GetContactListArgs();

    /**
     * The name of the contact list.
     * 
     */
    @InputImport(name="contactListName", required=true)
        private final String contactListName;

    public String getContactListName() {
        return this.contactListName;
    }

    public GetContactListArgs(String contactListName) {
        this.contactListName = Objects.requireNonNull(contactListName, "expected parameter 'contactListName' to be non-null");
    }

    private GetContactListArgs() {
        this.contactListName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContactListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contactListName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetContactListArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactListName = defaults.contactListName;
        }

        public Builder setContactListName(String contactListName) {
            this.contactListName = Objects.requireNonNull(contactListName);
            return this;
        }
        public GetContactListArgs build() {
            return new GetContactListArgs(contactListName);
        }
    }
}
