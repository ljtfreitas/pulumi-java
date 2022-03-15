// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssmcontacts.outputs;

import io.pulumi.awsnative.ssmcontacts.outputs.ContactChannelTargetInfo;
import io.pulumi.awsnative.ssmcontacts.outputs.ContactTargetInfo;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContactTargets {
    private final @Nullable ContactChannelTargetInfo channelTargetInfo;
    private final @Nullable ContactTargetInfo contactTargetInfo;

    @CustomType.Constructor
    private ContactTargets(
        @CustomType.Parameter("channelTargetInfo") @Nullable ContactChannelTargetInfo channelTargetInfo,
        @CustomType.Parameter("contactTargetInfo") @Nullable ContactTargetInfo contactTargetInfo) {
        this.channelTargetInfo = channelTargetInfo;
        this.contactTargetInfo = contactTargetInfo;
    }

    public Optional<ContactChannelTargetInfo> getChannelTargetInfo() {
        return Optional.ofNullable(this.channelTargetInfo);
    }
    public Optional<ContactTargetInfo> getContactTargetInfo() {
        return Optional.ofNullable(this.contactTargetInfo);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactTargets defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ContactChannelTargetInfo channelTargetInfo;
        private @Nullable ContactTargetInfo contactTargetInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactTargets defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelTargetInfo = defaults.channelTargetInfo;
    	      this.contactTargetInfo = defaults.contactTargetInfo;
        }

        public Builder channelTargetInfo(@Nullable ContactChannelTargetInfo channelTargetInfo) {
            this.channelTargetInfo = channelTargetInfo;
            return this;
        }

        public Builder contactTargetInfo(@Nullable ContactTargetInfo contactTargetInfo) {
            this.contactTargetInfo = contactTargetInfo;
            return this;
        }
        public ContactTargets build() {
            return new ContactTargets(channelTargetInfo, contactTargetInfo);
        }
    }
}
