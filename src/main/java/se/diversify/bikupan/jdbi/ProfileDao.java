package se.diversify.bikupan.jdbi;

import com.google.common.base.Optional;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.SingleValueResult;
import org.skife.jdbi.v2.sqlobject.mixins.GetHandle;
import se.diversify.bikupan.core.Profile;

/**
 * @author danval
 */

public abstract class ProfileDao implements GetHandle {

    @SqlQuery("")
    @SingleValueResult
    public abstract Optional<Profile> get(long id);

}
