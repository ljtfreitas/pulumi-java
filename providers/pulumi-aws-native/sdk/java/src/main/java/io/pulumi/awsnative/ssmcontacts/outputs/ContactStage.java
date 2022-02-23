// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssmcontacts.outputs;

import io.pulumi.awsnative.ssmcontacts.outputs.ContactTargets;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContactStage {
    /**
     * The time to wait until beginning the next stage.
     * 
     */
    private final Integer durationInMinutes;
    /**
     * The contacts or contact methods that the escalation plan or engagement plan is engaging.
     * 
     */
    private final @Nullable List<ContactTargets> targets;

    @OutputCustomType.Constructor({"durationInMinutes","targets"})
    private ContactStage(
        Integer durationInMinutes,
        @Nullable List<ContactTargets> targets) {
        this.durationInMinutes = Objects.requireNonNull(durationInMinutes);
        this.targets = targets;
    }

    /**
     * The time to wait until beginning the next stage.
     * 
     */
    public Integer getDurationInMinutes() {
        return this.durationInMinutes;
    }
    /**
     * The contacts or contact methods that the escalation plan or engagement plan is engaging.
     * 
     */
    public List<ContactTargets> getTargets() {
        return this.targets == null ? List.of() : this.targets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactStage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer durationInMinutes;
        private @Nullable List<ContactTargets> targets;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactStage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.durationInMinutes = defaults.durationInMinutes;
    	      this.targets = defaults.targets;
        }

        public Builder setDurationInMinutes(Integer durationInMinutes) {
            this.durationInMinutes = Objects.requireNonNull(durationInMinutes);
            return this;
        }

        public Builder setTargets(@Nullable List<ContactTargets> targets) {
            this.targets = targets;
            return this;
        }
        public ContactStage build() {
            return new ContactStage(durationInMinutes, targets);
        }
    }
}
